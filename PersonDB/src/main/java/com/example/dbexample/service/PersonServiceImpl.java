package com.example.dbexample.service;

import com.example.dbexample.personClass.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;



import com.example.dbexample.personClass.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void save(Person person) {
        String sql = "INSERT INTO persondb.person (first_name, last_name, phone, email, address)" +
                "VALUES(:firstName,:lastName,:phone,:email,:address)";

        int update = jdbcTemplate.update(sql, new BeanPropertySqlParameterSource(person));
        String message = (update > 0) ? "Record Inserted Successfully" : "Record Insertion Failed";
    }


    @Override
    public Person load(long id) {
        List<Person> persons = jdbcTemplate.query("SELECT * FROM person WHERE id = :id",
                new MapSqlParameterSource("id", id), (resultSet, i) -> toPerson(resultSet));

        return persons.isEmpty() ? null : persons.get(0);
    }

    @Override
    public void delete(long id) {
        String sql = "DELETE FROM person WHERE id = :id";
        jdbcTemplate.update(sql, new MapSqlParameterSource("id", id));
    }

    @Override
    public void update(Person person) {
        // Implement this method to update a person's information
    }

    @Override
    public void updateAddress(long id, String newAddress) {
        String sql = "UPDATE person SET address = :address WHERE id = :id";
        jdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("id", id)
                .addValue("address", newAddress));
    }

    @Override
    public List<Person> loadAll() {
        return jdbcTemplate.query("SELECT * FROM person", (resultSet, i) -> toPerson(resultSet));
    }

    @Override
    public List<Person> findPersonsByLastName(String name) {
        String sql = "SELECT * FROM person WHERE last_name = :lastName";
        return jdbcTemplate.query(sql, new MapSqlParameterSource("lastName", name), (resultSet, i) -> toPerson(resultSet));
    }

    @Override
    public Long getPersonCount() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM person", new MapSqlParameterSource(), Long.class);
    }

    private Person toPerson(java.sql.ResultSet resultSet) throws java.sql.SQLException {
        Person person = new Person();
        person.setId(resultSet.getLong("id"));
        person.setFirstName(resultSet.getString("first_name"));
        person.setLastName(resultSet.getString("last_name"));
        person.setPhone(resultSet.getString("phone"));
        person.setEmail(resultSet.getString("email"));
        person.setAddress(resultSet.getString("address"));
        return person;
    }
}
