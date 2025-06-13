package com.mjtech.xml_generator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "NewDataSet")
public class PalletRequest {
    @JsonProperty("Table")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Table")
    private List<PalletData> table;
}
