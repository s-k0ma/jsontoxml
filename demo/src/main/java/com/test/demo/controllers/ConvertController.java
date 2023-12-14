package com.test.demo.controllers;

import com.test.demo.data.JsonToXmlConverter;
import com.test.demo.data.SubObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConvertController {
    @PostMapping("/convert")
    public String convertJsonToXml(@RequestBody SubObject inputObject) {
        return new JsonToXmlConverter().converJsonToXml(inputObject);
    }

    @PostMapping
    public String convertArrToXml(@RequestBody List<SubObject> inputObjects){
        return new JsonToXmlConverter().converJsonToXml(inputObjects);
    }
}
