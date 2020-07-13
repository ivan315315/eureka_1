package com.example.eurekaClient.controller;

import com.example.eurekaClient.dto.LineDto;
import com.example.eurekaClient.dto.PersonDto;
import com.example.eurekaClient.moc.PersonsMoc;
import com.example.eurekaClient.util.JsonLine;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class EurekaClientController implements Greeting,  Person{
    private static final Logger log = getLogger(EurekaClientController.class);

    //@Qualifier("eurekaClient")
    @Qualifier("eurekaClient")
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public LineDto greeting() {
        log.info("in greeting");
        return JsonLine.getJsonLine(String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName()));
    }

    @Override
    public LineDto getPersonInfo(Integer personId) {
        log.info("in getPersonInfo");
        PersonDto person = PersonsMoc.personDtoSet.stream().filter(personDto -> personDto.getId() == personId).findFirst().orElse(null);
        if (person == null) {
            return null;
        }
        return JsonLine.getJsonLine(String.format("Person: %s %s", person.getFirstName(), person.getLastName()));
    }

    @Override
    public PersonDto getPerson(Integer personId) {
        log.info("in getPerson");
        return PersonsMoc.personDtoSet.stream().filter(personDto -> personDto.getId() == personId).findFirst().orElse(null);
    }

    @Override
    public Set<PersonDto> getAll() {
        log.info("in getAll");
        return PersonsMoc.personDtoSet;
    }
}
