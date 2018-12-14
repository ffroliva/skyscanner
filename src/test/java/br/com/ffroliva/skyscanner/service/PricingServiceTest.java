package br.com.ffroliva.skyscanner.service;

import br.com.ffroliva.skyscanner.AppConfig;
import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import br.com.ffroliva.skyscanner.service.impl.PricingServiceImpl;
import br.com.ffroliva.skyscanner.utils.DateUtil;
import com.jayway.jsonpath.internal.path.PredicateContextImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

@RunWith(SpringRunner.class)

@Slf4j
public class PricingServiceTest {


    private PricingService pricingService;

    @Before
    public void before(){
        pricingService = new PricingServiceImpl();
        pricingService.createSession(PricingServiceImpl.buildCreateSession());

    }

    @Test
    public void fetchFlightPricingTest(){
        pricingService.fetchFights(PricingServiceImpl.buildCreateSession());
    }

    @Test
    public void createSession(){
        pricingService.createSession(PricingServiceImpl.buildCreateSession());
    }
}
