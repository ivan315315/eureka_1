package com.example.eurekaRestTemplateClient.controller;


import com.example.eurekaRestTemplateClient.dto.LineDto;
import com.example.eurekaRestTemplateClient.dto.PersonDto;
import com.example.eurekaRestTemplateClient.util.JsonLine;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class Person {
    private static final Logger log = getLogger(Person.class);

    @Value("${client.url}")
    private String url;
    //private static final String url = "http://localhost:8081";

    @GetMapping(value = "/greeting")
    String greeting(){
        log.info("in greeting");
        RestTemplate restTemplate = new RestTemplate();
        LineDto line = restTemplate.getForObject(url + "/greeting", LineDto.class);
        return line.toString();
    }

    @GetMapping(value = "/persons/info/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    LineDto getPersonInfo(@PathVariable("personId") Integer personId){
        log.info("in getPersonInfo");
        RestTemplate restTemplate = new RestTemplate();
        LineDto line = restTemplate.getForObject(url + "/persons/info/" + personId, LineDto.class);
        return line;
    }

    @GetMapping(value = "/persons/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    PersonDto getPerson(@PathVariable("personId") Integer personId){
        log.info("in getPerson");
        RestTemplate restTemplate = new RestTemplate();
        PersonDto person = restTemplate.getForObject(url + "/persons/" + personId, PersonDto.class);
        return person;
    }

    @GetMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    Set<PersonDto> getAll(){
        log.info("in getAll");
        RestTemplate restTemplate = new RestTemplate();
        PersonDto[] persons = restTemplate.getForObject(url + "/persons", PersonDto[].class);
        Set<PersonDto> personDtoSet = new HashSet<>();
        Collections.addAll(personDtoSet, persons);
        return personDtoSet;
    }

}
