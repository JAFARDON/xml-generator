package com.mjtech.xml_generator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Table")
public class PalletData {

    @JsonProperty("Warehouse")
    private String warehouse;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Route")
    private String route;

    @JsonProperty("Customer")
    private String customer;

    @JsonProperty("SalesOrder")
    private String salesOrder;

    @JsonProperty("Quantity")
    private String quantity;

    @JsonProperty("Combine")
    private String combine;

    @JsonProperty("stop")
    private String stop;

    @JsonProperty("Pallet")
    private String pallet;

    @JsonProperty("Line")
    private String line;

    @JsonProperty("UnitMeasure")
    private String unitMeasure;

    @JsonProperty("Item")
    private String item;

    @JsonProperty("PalletIDGUID")
    private String palletIDGUID;
}