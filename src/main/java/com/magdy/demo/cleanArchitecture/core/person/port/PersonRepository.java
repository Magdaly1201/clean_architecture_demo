package com.magdy.demo.cleanArchitecture.core.person.port;

import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.model.PersonRequest;

import java.util.List;

public interface PersonRepository {

   Person findByDni(Long dni);

   Person save(PersonRequest personRequest);

   List<Person> findAll();
}
