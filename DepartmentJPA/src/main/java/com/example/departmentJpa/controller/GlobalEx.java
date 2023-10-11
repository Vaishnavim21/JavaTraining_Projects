package com.example.departmentJpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.departmentJpa.Exception.DuplicateEmailException;

@RestControllerAdvice
public class GlobalEx {
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<Object> globalexception(DuplicateEmailException messagge) {
		return new ResponseEntity<Object>(messagge.getMessage(), HttpStatus.NOT_FOUND);
	}

}
