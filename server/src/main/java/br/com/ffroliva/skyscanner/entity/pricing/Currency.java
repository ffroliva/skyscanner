
package br.com.ffroliva.skyscanner.entity.pricing;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Symbol",
    "ThousandsSeparator",
    "DecimalSeparator",
    "SymbolOnLeft",
    "SpaceBetweenAmountAndSymbol",
    "RoundingCoefficient",
    "DecimalDigits"
})
public class Currency implements Serializable
{

    @JsonProperty("Code")
    public String code;
    @JsonProperty("Symbol")
    public String symbol;
    @JsonProperty("ThousandsSeparator")
    public String thousandsSeparator;
    @JsonProperty("DecimalSeparator")
    public String decimalSeparator;
    @JsonProperty("SymbolOnLeft")
    public Boolean symbolOnLeft;
    @JsonProperty("SpaceBetweenAmountAndSymbol")
    public Boolean spaceBetweenAmountAndSymbol;
    @JsonProperty("RoundingCoefficient")
    public Integer roundingCoefficient;
    @JsonProperty("DecimalDigits")
    public Integer decimalDigits;
    private final static long serialVersionUID = -4885762413772571993L;

}
