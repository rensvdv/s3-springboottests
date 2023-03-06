package com.example.restdb.services;


import com.example.restdb.logic.Person;
import com.example.restdb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    public List<Person> GetAll() {
        return personRepository.findAll();
    }

    public Person CreatePerson(Person person) {
        return personRepository.save(person);
    }
}
