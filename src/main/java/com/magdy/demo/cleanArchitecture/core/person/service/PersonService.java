package com.magdy.demo.cleanArchitecture.core.person.service;

import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.model.PersonRequest;
import com.magdy.demo.cleanArchitecture.core.person.port.PersonRepository;

import java.util.List;

public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPerson(Long dni) {
        return personRepository.findByDni(dni);
    }

    public Person create(PersonRequest personRequest) {
        return personRepository.save(personRequest);
    }

    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
