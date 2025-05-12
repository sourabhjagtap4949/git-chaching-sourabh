package com.example.cacheExample.service;

import com.example.cacheExample.model.Person;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {


    @CachePut(cacheNames = "person", key = "#name")
    public Person getPersons(String name) {
        System.out.println("Hitting person api");
        Person person = new Person();
        Random r= new Random();
        person.setPersonId(r.nextInt());
        person.setPersonName(name);
        return person;
    }

    @CachePut(cacheNames = "person", key = "#name")
    public Person fetchPersons(Person personR) {
        System.out.println("Hitting person api");
        Person person = new Person();
        Random r= new Random();
        person.setPersonId(r.nextInt());
        person.setPersonName(personR.getPersonName());
        return person;
    }

}
