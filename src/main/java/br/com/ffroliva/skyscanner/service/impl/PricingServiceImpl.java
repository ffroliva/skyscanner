package br.com.ffroliva.skyscanner.service.impl;

import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import br.com.ffroliva.skyscanner.entity.pricing.Pricing;
import br.com.ffroliva.skyscanner.service.PricingService;
import br.com.ffroliva.skyscanner.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.client.ClientResponse;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class PricingServiceImpl implements PricingService {


    Client client = ClientBuilder.newClient();
    WebTarget webTarget
            = client.target("http://partners.api.skyscanner.net/apiservices/pricing/v1.0");

    @Override
    public String fetchFights(CreateSession searchFlight) {
       // String createdSession = createSession(searchFlight);
        StringBuilder sb = new StringBuilder("/").append("b0849e37-4290-4a68-9d95-31e9ef22869b");    Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://partners.api.skyscanner.net/apiservices/pricing/v1.0")
                .path(sb.toString())
                .queryParam("apiKey",searchFlight.getApiKey());
        Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE)
                .get();

        response.bufferEntity();
        String entity = response.readEntity(String.class);
        log.debug(String.format("Poll results: %s",entity));
        return entity;
    }

    private String createSession(CreateSession createSession) {
        String createdSession = null;

        String response = webTarget
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(getForm(createSession),
                        MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                        String.class);
        log.debug(response);
        return createdSession;
    }

    private Form getForm(CreateSession createSession) {
        final Form form = new Form();
        form.param("cabinClass", createSession.getCabinclass());
        form.param("country", createSession.getCountry());
        form.param("currency", createSession.getCurrency());
        form.param("locale", createSession.getLocale());
        form.param("locationSschema", createSession.getLocationSchema());
        form.param("originPlace", createSession.getOriginplace());
        form.param("destinationPlace", createSession.getDestinationplace());
        form.param("outboundDate", createSession.getOutbounddate());
        form.param("inboundDate", createSession.getInbounddate());
        form.param("adults", createSession.getAdults().toString());
        form.param("apiKey", createSession.getApiKey());
        return form;
    }

    public String fetchNextMondayFlights(){
       return this.fetchFights(createSession());
    }

    public static CreateSession createSession(){
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
                .apiKey("")
                .build();
    }

}
