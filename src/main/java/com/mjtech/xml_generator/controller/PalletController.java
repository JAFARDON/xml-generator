package com.mjtech.xml_generator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mjtech.xml_generator.model.PalletRequest;
import com.mjtech.xml_generator.model.WrapperRequest;

@RestController
@RequestMapping("/api")
public class PalletController {

    @PostMapping("/convert-json-to-xml")
    public ResponseEntity<String> convertJsonToXml(@RequestBody WrapperRequest wrapperRequest) throws JsonProcessingException {

        if (wrapperRequest == null || wrapperRequest.getNewDataSet() == null) {
            throw new IllegalArgumentException("Invalid request: NewDataSet is required");
        }

        PalletRequest request = wrapperRequest.getNewDataSet();

        if (request.getTable() == null || request.getTable().isEmpty()) {
            throw new IllegalArgumentException("Table is null or empty - check field names");
        }

        XmlMapper xmlMapper = new XmlMapper();

        String xmlContent = xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(request);

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + xmlContent;

        return ResponseEntity.ok()
                .header("Content-Type", "application/xml; charset=UTF-8")
                .body(xml);
    }
}
