package com.magdy.demo.cleanArchitecture.infrastructure.delivery;

import com.magdy.demo.cleanArchitecture.adapter.delivery.PersonEndpoints;
import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.model.PersonRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody PersonRequest personRequest){
        return personEndpoints.create(personRequest);
    }

    @GetMapping
    public List<Person> getAll(){
        return personEndpoints.getAll();
    }
}
