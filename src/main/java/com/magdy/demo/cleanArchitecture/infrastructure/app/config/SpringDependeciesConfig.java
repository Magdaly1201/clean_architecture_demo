package com.magdy.demo.cleanArchitecture.infrastructure.app.config;

import com.magdy.demo.cleanArchitecture.adapter.delivery.PersonEndpoints;
import com.magdy.demo.cleanArchitecture.core.person.service.PersonService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.magdy.demo.cleanArchitecture")
public class SpringDependeciesConfig {

    @Bean
    public PersonService personService() {
        return new PersonService();
    }

    @Bean
    public PersonEndpoints personControllerr() {
        return new PersonEndpoints(personService());
    }


}
