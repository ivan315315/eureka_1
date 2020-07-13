package com.example.eurekaFeignClient.controller;

import com.example.eurekaFeignClient.config.FeignConfig;
import com.example.eurekaFeignClient.dto.LineDto;
import com.example.eurekaFeignClient.dto.PersonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

@FeignClient(name = "spring-cloud-eureka-client", configuration = FeignConfig.class)
public interface GreetingClient {
    @GetMapping(value = "/greeting")
    LineDto greeting();

    @GetMapping(value = "/persons/info/{personId}")
    LineDto getPersonInfo(@PathVariable("personId") Integer personId);

    @GetMapping(value = "/persons/{personId}")
    PersonDto getPerson(@PathVariable("personId") Integer personId);

    @GetMapping(value = "/persons")
    Set<PersonDto> getAll();

}
