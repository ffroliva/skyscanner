
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FlightNumber",
    "CarrierId"
})
public class FlightNumber implements Serializable
{

    @JsonProperty("FlightNumber")
    public String flightNumber;
    @JsonProperty("CarrierId")
    public Integer carrierId;
    private final static long serialVersionUID = -7473041081879681116L;

}
