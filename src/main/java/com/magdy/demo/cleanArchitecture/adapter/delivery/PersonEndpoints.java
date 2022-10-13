package com.magdy.demo.cleanArchitecture.adapter.delivery;

import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.service.PersonService;

public class PersonEndpoints {

    private final PersonService personService;

    public PersonEndpoints(PersonService personService) {
        this.personService = personService;
    }

    public Person getPerson(long dni) {
        return personService.getPerson(dni);
    }
}
