package com.mjtech.xml_generator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "WrapperRequest")
public class WrapperRequest {
    @JsonProperty("NewDataSet")
    private PalletRequest newDataSet;
}