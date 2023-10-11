package com.example.dbexample.service;

import java.util.List;

import com.example.dbexample.personClass.Person;

public interface PersonService {
    public void save(Person person);
    public Person load(long id);
    public void delete(long id);
    public void update(Person person);
    public void updateAddress(long id, String newAddress);
    public List<Person> loadAll();
    public List<Person> findPersonsByLastName(String name);
    public Long getPersonCount();
}
