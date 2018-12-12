package br.com.ffroliva.skyscanner.service;

import br.com.ffroliva.skyscanner.entity.pricing.CreateSession;
import br.com.ffroliva.skyscanner.entity.pricing.Pricing;

public interface PricingService {

    String fetchFights(CreateSession searchFlight);

    String fetchNextMondayFlights();


}
