package com.example.departmentJpa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.departmentJpa.entityclass.Department;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department createDepartment(Department department);

	ResponseEntity<Object> updateDepartment(Long id, Department updatedDepartment);
    void deleteDepartment(Long id);
    boolean isEmailUnique(String email, Long id);
	boolean existsByEmail(String email);
	
}
