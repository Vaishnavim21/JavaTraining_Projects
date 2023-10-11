package com.example.database.service;

import java.util.List;

import com.example.database.entityclass.*;

public interface EmployeeService{
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public int deleteById(int id);
	
	public int save(Employee e);
	
	public Employee update(Employee e, int id);
}