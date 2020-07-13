package com.example.eurekaClient.moc;


import com.example.eurekaClient.dto.DocDto;
import com.example.eurekaClient.dto.PersonDto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PersonsMoc {
    public static final Set<PersonDto> personDtoSet = new HashSet<>();
    static {
        DocDto docDto = new DocDto("SN33", 333333);
        Collections.addAll(personDtoSet,
                new PersonDto(1, "Ivan", "Ivanov", new DocDto("SN33", 333333)),
                new PersonDto(2, "Petr", "Petrov", new DocDto("SN55", 555555)),
                new PersonDto(3, "Pavel", "Pavlov", new DocDto("SN77", 777777)));
    }
}
