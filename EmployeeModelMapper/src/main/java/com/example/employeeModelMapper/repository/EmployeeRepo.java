package com.example.employeeModelMapper.repository;

import com.example.employeeModelMapper.entity.*;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
  
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	Optional<Employee> findById(int id);
  
}