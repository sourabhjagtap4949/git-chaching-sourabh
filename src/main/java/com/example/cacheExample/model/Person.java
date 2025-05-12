package com.example.cacheExample.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private Integer personId;
    private String personName;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
