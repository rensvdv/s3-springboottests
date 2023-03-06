package com.example.restdb.controllers;

import com.example.restdb.logic.Person;
import com.example.restdb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getAll")
    public List<Person> GetAll() {
        return personService.GetAll();
    }

    @PostMapping("/addUser")
    public Person AddPerson(@RequestBody Person person) {
        return personService.CreatePerson(person);
    }

}
