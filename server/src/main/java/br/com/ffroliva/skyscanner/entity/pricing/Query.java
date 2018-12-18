
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Country",
    "Currency",
    "Locale",
    "Adults",
    "Children",
    "Infants",
    "OriginPlace",
    "DestinationPlace",
    "OutboundDate",
    "InboundDate",
    "LocationSchema",
    "CabinClass",
    "GroupPricing"
})
public class Query implements Serializable
{

    @JsonProperty("Country")
    public String country;
    @JsonProperty("Currency")
    public String currency;
    @JsonProperty("Locale")
    public String locale;
    @JsonProperty("Adults")
    public Integer adults;
    @JsonProperty("Children")
    public Integer children;
    @JsonProperty("Infants")
    public Integer infants;
    @JsonProperty("OriginPlace")
    public String originPlace;
    @JsonProperty("DestinationPlace")
    public String destinationPlace;
    @JsonProperty("OutboundDate")
    public String outboundDate;
    @JsonProperty("InboundDate")
    public String inboundDate;
    @JsonProperty("LocationSchema")
    public String locationSchema;
    @JsonProperty("CabinClass")
    public String cabinClass;
    @JsonProperty("GroupPricing")
    public Boolean groupPricing;
    private final static long serialVersionUID = -5621368288456129439L;

}
