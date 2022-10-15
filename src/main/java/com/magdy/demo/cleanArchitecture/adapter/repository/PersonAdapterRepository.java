package com.magdy.demo.cleanArchitecture.adapter.repository;

import com.magdy.demo.cleanArchitecture.adapter.shared.Mapper;
import com.magdy.demo.cleanArchitecture.core.person.model.Person;
import com.magdy.demo.cleanArchitecture.core.person.model.PersonRequest;
import com.magdy.demo.cleanArchitecture.core.person.port.PersonRepository;
import com.magdy.demo.cleanArchitecture.infrastructure.repository.dao.PersonDao;

public class PersonAdapterRepository implements PersonRepository {

    private final PersonDao personDao;

    private final Mapper mapper;

    public PersonAdapterRepository(PersonDao personDao, Mapper mapper) {
        this.personDao = personDao;
        this.mapper = mapper;
    }

    @Override
    public Person findByDni(Long dni) {
        return mapper.toDTO(personDao.findById(dni).orElseThrow(()-> new RuntimeException("Not found")));
    }

    @Override
    public Person save(PersonRequest personRequest) {
        return mapper.toDTO(personDao.save(mapper.toEntity(personRequest)));
    }
}
