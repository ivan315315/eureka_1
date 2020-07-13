package com.example.eurekaFeignClient.moc;

import com.example.eurekaFeignClient.dto.DocDto;
import com.example.eurekaFeignClient.dto.PersonDto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PersonsMoc {
    public static final Set<PersonDto> personDtoMap = new HashSet<>();
    static {
        Collections.addAll(personDtoMap,
                new PersonDto(1, "InFeignIvan", "Ivanov", new DocDto("SN33", 333333)),
                new PersonDto(3, "InFeignPavel", "Pavlov", new DocDto("SN77", 777777)));
    }
}
