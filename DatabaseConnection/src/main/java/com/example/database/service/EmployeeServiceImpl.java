package com.example.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
                       

import com.example.database.entityclass.*;

@Repository
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM tbl_employees", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM tbl_employees WHERE id=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM tbl_employees WHERE id=?", id);
	}

	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO tbl_employees (name, location, department) VALUES (?, ?, ?)", new Object[] {e.getName(), e.getLocation(), e.getDepartment()});
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee update(Employee e, int id) {
		int rowCount= jdbcTemplate.update("UPDATE tbl_employees SET name = ?, location = ?, department = ? WHERE id = ?", new Object[] {e.getName(), e.getLocation(), e.getDepartment(), id});
		if (rowCount == 1) {
	        // If one row was updated, retrieve and return the updated Employee details
	        Employee updatedEmployee = jdbcTemplate.queryForObject(
	            "SELECT * FROM tbl_employees WHERE id = ?",
	            new Object[] { id },
	            new BeanPropertyRowMapper<>(Employee.class)
	        );

	        return updatedEmployee;
	    } else {
	        
	        return null; 
	    }
	}
		
}