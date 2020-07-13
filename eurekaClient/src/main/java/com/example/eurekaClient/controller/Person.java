package com.example.eurekaClient.controller;

import com.example.eurekaClient.dto.LineDto;
import com.example.eurekaClient.dto.PersonDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public interface Person {
    @GetMapping(value = "/persons/info/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    LineDto getPersonInfo(@PathVariable("personId") Integer personId);

    @GetMapping(value = "/persons/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    PersonDto getPerson(@PathVariable("personId") Integer personId);

    @GetMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    Set<PersonDto> getAll();


}
