package co.com.gsdd.jeeservice.rest.api.impl;

import java.util.Objects;
import java.util.UUID;

import co.com.gsdd.jeeservice.model.Person;
import co.com.gsdd.jeeservice.rest.api.PersonRest;

public class PersonRestImpl implements PersonRest {

    @Override
    public Person getPersonById(String personId) {
        Person p = generatePerson();
        return Objects.equals(personId, p.getIdNumber()) ? p : null;
    }

    private Person generatePerson() {
        Person p = new Person();
        p.setIdNumber("123456");
        p.setName(UUID.randomUUID().toString());
        p.setLastName(UUID.randomUUID().toString());
        return p;
    }

}
