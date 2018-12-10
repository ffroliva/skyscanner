
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Uri",
    "Body",
    "Method"
})
public class BookingDetailsLink implements Serializable
{

    @JsonProperty("Uri")
    public String uri;
    @JsonProperty("Body")
    public String body;
    @JsonProperty("Method")
    public String method;
    private final static long serialVersionUID = 6002577987559059504L;

}
