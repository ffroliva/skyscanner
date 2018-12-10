
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Code",
    "Name",
    "ImageUrl",
    "DisplayCode"
})
public class Carrier implements Serializable
{

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ImageUrl")
    public String imageUrl;
    @JsonProperty("DisplayCode")
    public String displayCode;
    private final static long serialVersionUID = -8453207707909015283L;

}
