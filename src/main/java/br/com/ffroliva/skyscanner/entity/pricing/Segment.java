
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "OriginStation",
    "DestinationStation",
    "DepartureDateTime",
    "ArrivalDateTime",
    "Carrier",
    "OperatingCarrier",
    "Duration",
    "FlightNumber",
    "JourneyMode",
    "Directionality"
})
public class Segment implements Serializable
{

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("OriginStation")
    public Integer originStation;
    @JsonProperty("DestinationStation")
    public Integer destinationStation;
    @JsonProperty("DepartureDateTime")
    public String departureDateTime;
    @JsonProperty("ArrivalDateTime")
    public String arrivalDateTime;
    @JsonProperty("Carrier")
    public Integer carrier;
    @JsonProperty("OperatingCarrier")
    public Integer operatingCarrier;
    @JsonProperty("Duration")
    public Integer duration;
    @JsonProperty("FlightNumber")
    public String flightNumber;
    @JsonProperty("JourneyMode")
    public String journeyMode;
    @JsonProperty("Directionality")
    public String directionality;
    private final static long serialVersionUID = -1221705907560762118L;

}
