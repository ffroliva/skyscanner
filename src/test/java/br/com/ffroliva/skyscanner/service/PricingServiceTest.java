package br.com.ffroliva.skyscanner.service;

import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PricingServiceTest {

    private CreateSession createSession;

    @Autowired
    private PricingService pricingService;

    @Before
    public void before(){
        createSession = CreateSession.builder()
                .country("")
                .build();
    }

    @Test
    public void fetchFlightPricingTest(){
        pricingService.fetchFights(createSession);
    }
}
