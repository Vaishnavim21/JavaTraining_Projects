package com.example.dbexample.controller;



import com.example.dbexample.personClass.Person;
import com.example.dbexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class personController{

    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable long id) {
        return personService.load(id);
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.loadAll();
    }

    @GetMapping("/byLastName/{lastName}")
    public List<Person> getPersonsByLastName(@PathVariable String lastName) {
        return personService.findPersonsByLastName(lastName);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id) {
        personService.delete(id);
    }

    @PutMapping("/{id}/updateAddress")
    public void updatePersonAddress(@PathVariable long id, @RequestParam String newAddress) {
        personService.updateAddress(id, newAddress);
    }

    @GetMapping("/count")
    public Long getPersonCount() {
        return personService.getPersonCount();
    }
}
