package com.example.eurekaClient.controller;

import com.example.eurekaClient.dto.LineDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

public interface Greeting {
    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    LineDto greeting();
}
