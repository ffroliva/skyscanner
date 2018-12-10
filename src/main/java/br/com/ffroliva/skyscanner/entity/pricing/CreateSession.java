package br.com.ffroliva.skyscanner.entity.pricing;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateSession {

    private String country;
    private String currency;
    private String locale;
    private String originPlace;
    private String destinationPlace;
    private String outboundDate;
    private String inboundDate;
    private String cabinClass;
    private String adults;
    private String children;
    private String infants;
    private String includeCarriers;
    private String excludeCarriers;
    private String groupPricing;
    private String apiKey;

}
