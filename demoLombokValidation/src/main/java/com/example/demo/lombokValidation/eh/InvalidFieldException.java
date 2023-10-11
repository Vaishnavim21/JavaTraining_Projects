package com.example.demo.lombokValidation.eh;

public class InvalidFieldException extends Exception {
	
	private static final long serialVersionUID = 1L;
	 public InvalidFieldException(String message) {
		 super(message);
	 }

}
