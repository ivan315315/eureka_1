package com.example.eurekaRestTemplateClient.util;


import com.example.eurekaRestTemplateClient.dto.LineDto;

public class JsonLine {
    private static final String defaultType = "String";

    public static LineDto getJsonLine(String value){
        return new LineDto(defaultType, value);
    }

    public static LineDto getJsonLine(String type, String value){
        return new LineDto(type, value);
    }
}
