package com.example.demo.lombokValidation.eh;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int a=100;
		int b= 0;
		int result= 100/0;
		System.out.println(result);
		System.out.println("Rest of the code in try block");
		
	}

}
