package co.com.gsdd.jeeservice.rest.api.impl;

import co.com.gsdd.jeeservice.model.Person;
import co.com.gsdd.jeeservice.rest.api.PersonRest;

public class PersonRestImpl implements PersonRest {

    @Override
    public Person getPersonById(String personId) {
        Person p = new Person();
        p.setIdNumber("1234560789");
        p.setName("Alex");
        p.setLastName("Galvis");
        return p;
    }

}
