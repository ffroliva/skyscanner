package br.com.ffroliva.skyscanner.service.impl;

import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import br.com.ffroliva.skyscanner.entity.pricing.Pricing;
import br.com.ffroliva.skyscanner.service.PricingService;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class PricingServiceImpl implements PricingService {

    @Override
    public Pricing fetchFights(CreateSession searchFlight) {
        String createdSession = createSession(searchFlight);
        return null;
    }

    private String createSession(CreateSession searchFlight){
        String createdSession = null;

        Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://partners.api.skyscanner.net/apiservices/pricing/v1.0");

        WebTarget employeeWebTarget
                = webTarget.path("resources/employees");

        return createdSession;
    }
}
