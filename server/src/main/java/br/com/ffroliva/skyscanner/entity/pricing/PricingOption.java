
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Agents",
    "QuoteAgeInMinutes",
    "Price",
    "DeeplinkUrl"
})
public class PricingOption implements Serializable
{

    @JsonProperty("Agents")
    @Valid
    public List<Integer> agents = null;
    @JsonProperty("QuoteAgeInMinutes")
    public Integer quoteAgeInMinutes;
    @JsonProperty("Price")
    public Float price;
    @JsonProperty("DeeplinkUrl")
    public String deeplinkUrl;
    private final static long serialVersionUID = -8057782695599897096L;

}
