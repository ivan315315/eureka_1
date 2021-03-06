package com.example.eurekaClient.dto;

import java.io.Serializable;

public class LineDto implements Serializable {
    private String type;
    private String value;

    public LineDto() {
    }

    public LineDto(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LineDto{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

