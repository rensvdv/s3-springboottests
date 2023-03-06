package com.example.restdb.repositories;

import com.example.restdb.logic.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

