package com.magdy.demo.cleanArchitecture.adapter.shared;

import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.model.PersonRequest;
import com.magdy.demo.cleanArchitecture.infrastructure.repository.model.PersonEntity;
import org.modelmapper.ModelMapper;

public class Mapper {

    private final ModelMapper modelMapper;

    public Mapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PersonEntity toEntity(PersonRequest person){
       return this.modelMapper.map(person, PersonEntity.class);
    }

    public Person toDTO(PersonEntity person){
        return this.modelMapper.map(person, Person.class);
    }

}
