package com.example.eurekaFeignClient.dto;

import lombok.Data;

import java.io.Serializable;

//@EqualsAndHashCode(callSuper = true)
@Data
public class DocDto implements Serializable {
    private String serial;
    private Integer number;

    public DocDto() {
    }

    public DocDto(String serial, Integer number) {
        this.serial = serial;
        this.number = number;
    }

    @Override
    public String toString() {
        return "DocDto{" +
                "serial='" + serial + '\'' +
                ", number=" + number +
                '}';
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
