package com.magdy.demo.cleanArchitecture.infrastructure.repository.dao;

import com.magdy.demo.cleanArchitecture.infrastructure.repository.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonDao extends JpaRepository<PersonEntity, Long> {

}
