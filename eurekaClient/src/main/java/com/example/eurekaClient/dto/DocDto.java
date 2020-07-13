package com.example.eurekaClient.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
public class DocDto implements Serializable {
    private String serial;
    private Integer number;

    public DocDto() {
    }

    public DocDto(String serial, Integer number) {
        this.serial = serial;
        this.number = number;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
