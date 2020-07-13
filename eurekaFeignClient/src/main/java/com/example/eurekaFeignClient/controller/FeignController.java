package com.example.eurekaFeignClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@Controller
public class FeignController implements Serializable {
    private static final String message = "Info from eureka client";

    @Autowired
    private GreetingClient greetingClient;

    @GetMapping(value = "/get/greeting")
    public String getGreeting(Model model) {
        model.addAttribute("message", String.format("%s: %s", message, greetingClient.greeting().getValue()));
        return "greeting-view";
    }

    @GetMapping(value = "/get/persons/info/{personId}")
    public String getPersonInfo(Model model, @PathVariable("personId") Integer personId) {
        model.addAttribute("message", String.format("%s: %s", message, greetingClient.getPersonInfo(personId).getValue()));
        return "greeting-view";
    }

    @GetMapping(value = "/get/persons/{personId}")
    public String getPerson(Model model, @PathVariable("personId") Integer personId) {
        model.addAttribute("message", String.format("%s: %s", message, greetingClient.getPerson(personId)));
        return "greeting-view";
    }

    @GetMapping(value = "/get/persons")
    public String getAll(Model model) {
        model.addAttribute("message", String.format("%s: %s", message, greetingClient.getAll()));
        return "greeting-view";
    }
}
