
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OutboundLegId",
    "InboundLegId",
    "PricingOptions",
    "BookingDetailsLink"
})
public class Itinerary implements Serializable
{

    @JsonProperty("OutboundLegId")
    public String outboundLegId;
    @JsonProperty("InboundLegId")
    public String inboundLegId;
    @JsonProperty("PricingOptions")
    @Valid
    public List<PricingOption> pricingOptions = null;
    @JsonProperty("BookingDetailsLink")
    @Valid
    public BookingDetailsLink bookingDetailsLink;
    private final static long serialVersionUID = -578146152117046214L;

}
