package com.magdy.demo.cleanArchitecture.infrastructure.app.config;

import com.magdy.demo.cleanArchitecture.adapter.delivery.PersonEndpoints;
import com.magdy.demo.cleanArchitecture.adapter.repository.PersonAdapterRepository;
import com.magdy.demo.cleanArchitecture.adapter.shared.Mapper;
import com.magdy.demo.cleanArchitecture.core.person.service.PersonService;
import com.magdy.demo.cleanArchitecture.infrastructure.repository.dao.PersonDao;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SpringDependeciesConfig {

    private final PersonDao personDao;

    public SpringDependeciesConfig(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public Mapper mapper() {
        return new Mapper(modelMapper());
    }

    @Bean
    public PersonAdapterRepository personRepository() {
        return new PersonAdapterRepository(personDao,mapper());
    }

    @Bean
    public PersonService personService() {
        return new PersonService(personRepository());
    }

    @Bean
    public PersonEndpoints personControllerr() {
        return new PersonEndpoints(personService());
    }

}
