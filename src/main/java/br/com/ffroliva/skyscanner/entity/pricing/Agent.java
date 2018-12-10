
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Name",
    "ImageUrl",
    "Status",
    "OptimisedForMobile",
    "BookingNumber",
    "Type"
})
public class Agent implements Serializable
{

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ImageUrl")
    public String imageUrl;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("OptimisedForMobile")
    public Boolean optimisedForMobile;
    @JsonProperty("BookingNumber")
    public String bookingNumber;
    @JsonProperty("Type")
    public String type;
    private final static long serialVersionUID = 2344423900162511491L;

}
