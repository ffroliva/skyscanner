package br.com.ffroliva.skyscanner.service.impl;

import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import br.com.ffroliva.skyscanner.service.PricingService;
import br.com.ffroliva.skyscanner.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.el.PropertyNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class PricingServiceImpl implements PricingService {

    public static final String API_KEY_PROPERTY = "api.key";

    @Autowired
    Environment env;


    @Override
    public String fetchFights(CreateSession searchFlight) {
        String location = createSession(searchFlight);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(location)
                .queryParam("apiKey", searchFlight.getApiKey())
                .queryParam("pageIndex", 0)
                .queryParam("pageSize",10);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = new RestTemplate().exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);
        log.debug(String.format("Poll results: %s", entity));
        return response.getBody();
    }

    public String createSession(CreateSession createSession) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate
                .exchange("http://partners.api.skyscanner.net/apiservices/pricing/v1.0",
                        HttpMethod.POST,
                        createSessionForm(buildCreateSession()),
                        String.class);

        log.debug(String.format("Create session response: %s", response.toString()));


        return response.getHeaders().getLocation().toString();
    }

    public String fetchNextMondayFlights() {
        return this.fetchFights(buildCreateSession());
    }
    public CreateSession buildCreateSession() {

        String apiKey = env.getProperty(API_KEY_PROPERTY);

        if (apiKey == null) {
            throw new PropertyNotFoundException(new StringBuilder("Property not found. Please include -Dapi.key={key} ")
                    .append("in your vm arguments on the application's startup. ")
                    .append("If running with maven run mvn spring-boot -Dapi.key={key}").toString());
        }
        log.debug(String.format("APIKEY %s", apiKey));

        LocalDate nextMonday = DateUtil.getNextMonday();
        LocalDate nextDay = nextMonday.plusDays(1);
        return CreateSession.builder()
                .cabinclass("Economy")
                .country("UK")
                .currency("GBP")
                .locale("en-GB")
                .locationSchema("iata")
                .originplace("EDI")
                .destinationplace("LHR")
                .outbounddate(nextMonday.format(DateTimeFormatter.ISO_DATE))
                .inbounddate(nextDay.format(DateTimeFormatter.ISO_DATE))
                .adults(1)
                .apiKey(apiKey)
                .build();
    }

    public HttpEntity<MultiValueMap<String, String>> createSessionForm(CreateSession createSession) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/x-www-form-urlencoded");
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("cabinclass", createSession.getCabinclass());
        map.add("country", createSession.getCountry());
        map.add("currency", createSession.getCurrency());
        map.add("locale", createSession.getLocale());
        map.add("locationschema", createSession.getLocationSchema());
        map.add("originPlace", createSession.getOriginplace());
        map.add("destinationPlace", createSession.getDestinationplace());
        map.add("outboundDate", createSession.getOutbounddate());
        map.add("inboundDate", createSession.getInbounddate());
        map.add("adults", createSession.getAdults().toString());
        map.add("apiKey", createSession.getApiKey()) ;
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);
        return entity;
    }

}
