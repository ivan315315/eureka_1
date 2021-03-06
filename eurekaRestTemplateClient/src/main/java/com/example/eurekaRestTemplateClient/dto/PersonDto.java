package com.example.eurekaRestTemplateClient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


//@EqualsAndHashCode(callSuper = true)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDto implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private DocDto docDto;

    public PersonDto() {
    }

    public PersonDto(Integer id, String firstName, String lastName, DocDto docDto) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.docDto = docDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DocDto getDocDto() {
        return docDto;
    }

    public void setDocDto(DocDto docDto) {
        this.docDto = docDto;
    }
}
