
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "ParentId",
    "Code",
    "Type",
    "Name"
})
public class Place implements Serializable
{

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("ParentId")
    public Integer parentId;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Name")
    public String name;
    private final static long serialVersionUID = 4543050639863080290L;

}
