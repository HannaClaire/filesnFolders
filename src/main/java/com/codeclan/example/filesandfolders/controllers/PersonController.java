package com.codeclan.example.filesandfolders.controllers;

import com.codeclan.example.filesandfolders.models.Files;
import com.codeclan.example.filesandfolders.models.Person;
import com.codeclan.example.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/person")
    public ResponseEntity<List<Person>> ShowPerson(){
        List<Person> person = personRepository.findAll();
        return new ResponseEntity<>(person, HttpStatus.OK) ;
    }
    @GetMapping(value = "/person/new")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }


}
