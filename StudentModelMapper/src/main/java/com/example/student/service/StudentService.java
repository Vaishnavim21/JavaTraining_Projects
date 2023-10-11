package com.example.student.service;

import org.springframework.http.ResponseEntity;

import com.example.student.response.*;

public interface StudentService {
	public StudentResponse getStudentById(int id);

	public ResponseEntity<Object> createStudent(StudentResponse studentDto);
		
	}

