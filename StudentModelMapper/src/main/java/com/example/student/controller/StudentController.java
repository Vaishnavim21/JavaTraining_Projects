package com.example.student.controller;

import com.example.student.response.StudentResponse;
import com.example.student.serviceImplementation.StudentServiceImplementation;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServiceImplementation studentServiceImpl;

	@GetMapping("/{id}")
	private ResponseEntity<StudentResponse> getStudentDetails(@PathVariable("id") int id) {
		StudentResponse student = studentServiceImpl.getStudentById(id);
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}

	@PostMapping("/students")
	private ResponseEntity<Object> createStudent(@Valid @RequestBody StudentResponse studentDto) {
		return studentServiceImpl.createStudent(studentDto);
	}
	
}
