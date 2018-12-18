package br.com.ffroliva.skyscanner.entity.pricing;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateSession {

    private String country;
    private String currency;
    private String locale;
    private String locationSchema;
    private String originplace;
    private String destinationplace;
    private String outbounddate;
    private String inbounddate;
    private String cabinclass;
    private Integer adults = 1;
    private Integer children = 0;
    private Integer infants = 0;
    private String includeCarriers;
    private String excludeCarriers;
    private String groupPricing;
    private String apiKey;

}
