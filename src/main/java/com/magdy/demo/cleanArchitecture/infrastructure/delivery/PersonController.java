package com.magdy.demo.cleanArchitecture.infrastructure.delivery;

import com.magdy.demo.cleanArchitecture.adapter.delivery.PersonEndpoints;
import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonEndpoints personEndpoints;

    public PersonController(PersonEndpoints personalEndpoints) {
        this.personEndpoints = personalEndpoints;
    }

    @GetMapping("/{dni}")
    public Person getPeople(@PathVariable(value = "dni") Integer dni) {
        return personEndpoints.getPerson(dni);
    }
}
