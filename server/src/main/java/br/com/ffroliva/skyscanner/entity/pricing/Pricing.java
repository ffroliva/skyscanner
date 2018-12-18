
package br.com.ffroliva.skyscanner.entity.pricing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SessionKey",
    "Query",
    "Status",
    "Itineraries",
    "Legs",
    "Segments",
    "Carriers",
    "Agents",
    "Places",
    "Currencies"
})
@ToString
public class Pricing implements Serializable
{

    @JsonProperty("SessionKey")
    public String sessionKey;
    @JsonProperty("Query")
    @Valid
    public Query query;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Itineraries")
    @Valid
    public List<Itinerary> itineraries = null;
    @JsonProperty("Legs")
    @Valid
    public List<Leg> legs = null;
    @JsonProperty("Segments")
    @Valid
    public List<Segment> segments = null;
    @JsonProperty("Carriers")
    @Valid
    public List<Carrier> carriers = null;
    @JsonProperty("Agents")
    @Valid
    public List<Agent> agents = null;
    @JsonProperty("Places")
    @Valid
    public List<Place> places = null;
    @JsonProperty("Currencies")
    @Valid
    public List<Currency> currencies = null;
    private final static long serialVersionUID = -2130695891300716626L;

}
