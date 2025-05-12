package com.example.cacheExample.controller;

import com.example.cacheExample.model.Person;
import com.example.cacheExample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/fetchPerson/{name}")
    public Person getPersons(@PathVariable String name){
        Person person = personService.getPersons(name);
        return person;
    }

    @GetMapping("/fetchPersonNew/{name}")
    public Person fetchPersons(@PathVariable String name){

        Person personR = new Person();
        personR.setPersonName("sourabh");


        Person person = personService.fetchPersons(personR);
        return person;
    }




}
