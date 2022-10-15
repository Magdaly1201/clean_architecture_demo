package com.magdy.demo.cleanArchitecture.infrastructure.app.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.magdy.demo.cleanArchitecture")
@EnableJpaRepositories(basePackages = "com.magdy.demo.cleanArchitecture.infrastructure")
@EntityScan("com.magdy.demo.cleanArchitecture.infrastructure.repository")
public class CleanArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchitectureApplication.class, args);
	}
}
