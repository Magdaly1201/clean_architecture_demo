package com.magdy.demo.cleanArchitecture.core.person.service;

import com.magdy.demo.cleanArchitecture.core.person.model.Person;

public class PersonService {

    public Person getPerson(Long dni) {
        return new Person(dni, "magdaly");
    }
}
