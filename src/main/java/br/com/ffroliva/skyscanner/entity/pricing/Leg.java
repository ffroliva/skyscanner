
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "SegmentIds",
    "OriginStation",
    "DestinationStation",
    "Departure",
    "Arrival",
    "Duration",
    "JourneyMode",
    "Stops",
    "Carriers",
    "OperatingCarriers",
    "Directionality",
    "FlightNumbers"
})
public class Leg implements Serializable
{

    @JsonProperty("Id")
    public String id;
    @JsonProperty("SegmentIds")
    @Valid
    public List<Integer> segmentIds = null;
    @JsonProperty("OriginStation")
    public Integer originStation;
    @JsonProperty("DestinationStation")
    public Integer destinationStation;
    @JsonProperty("Departure")
    public String departure;
    @JsonProperty("Arrival")
    public String arrival;
    @JsonProperty("Duration")
    public Integer duration;
    @JsonProperty("JourneyMode")
    public String journeyMode;
    @JsonProperty("Stops")
    @Valid
    public List<Integer> stops = null;
    @JsonProperty("Carriers")
    @Valid
    public List<Integer> carriers = null;
    @JsonProperty("OperatingCarriers")
    @Valid
    public List<Integer> operatingCarriers = null;
    @JsonProperty("Directionality")
    public String directionality;
    @JsonProperty("FlightNumbers")
    @Valid
    public List<FlightNumber> flightNumbers = null;
    private final static long serialVersionUID = -8325354287281598099L;

}
