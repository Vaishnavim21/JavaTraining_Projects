package com.lombok.exception.CustomExceptions;

public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException(String msg) {
		super(msg);
	}

}
