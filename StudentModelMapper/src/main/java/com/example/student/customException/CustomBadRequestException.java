package com.example.student.customException;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomBadRequestException extends RuntimeException{
	public CustomBadRequestException(String message) {
        super(message);
	}
}
