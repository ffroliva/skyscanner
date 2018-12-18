package br.com.ffroliva.skyscanner.controller;

import br.com.ffroliva.skyscanner.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class PricingController {

    @Autowired
    PricingService pricingService;

    @Autowired
    Environment env;

    @GetMapping(value = "/fetchNextMondayFlights", produces = MediaType.APPLICATION_JSON)
    public String fetchNextMondayFlights(){
        return pricingService.fetchNextMondayFlights();
    }

}
