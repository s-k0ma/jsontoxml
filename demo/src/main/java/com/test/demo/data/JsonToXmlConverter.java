package com.test.demo.data;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConverter {
    public String converJsonToXml(Object inputObject){
        try{
            return new XmlMapper().writeValueAsString(inputObject);

        }catch(Exception e){
            e.printStackTrace();
            return "Error convert JSON to XML";
        }
    }
}
