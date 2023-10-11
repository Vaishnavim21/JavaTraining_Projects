package com.example.departmentJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.departmentJpa.entityclass.Department;
import com.example.departmentJpa.service.DepartmentService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	private final DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@GetMapping("/")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	}

	@PostMapping("/")
	public ResponseEntity<Department> createDepartment(@RequestBody Department department) {

		if (departmentService.existsByEmail(department.getEmail())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
		}

		Department savedDepartment = departmentService.createDepartment(department);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedDepartment);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateDepartment(@Valid @PathVariable Long id,@Valid @RequestBody Department updatedDepartment) {

		return departmentService.updateDepartment(id, updatedDepartment);

//		Department savedDepartment = departmentService.createDepartment(updatedDepartment);
//		return ResponseEntity.status(HttpStatus.CREATED).body(savedDepartment);
	}

	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}
}
