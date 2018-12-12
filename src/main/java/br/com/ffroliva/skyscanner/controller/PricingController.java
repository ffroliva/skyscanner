package br.com.ffroliva.skyscanner.controller;

import br.com.ffroliva.skyscanner.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@RestController
public class PricingController {

    @Autowired
    PricingService pricingService;

    @GetMapping(value = "/flights/string", produces = MediaType.APPLICATION_JSON)
    public String fetchFlightsAsString(){
        return pricingService.fetchNextMondayFlights();
    }

}
