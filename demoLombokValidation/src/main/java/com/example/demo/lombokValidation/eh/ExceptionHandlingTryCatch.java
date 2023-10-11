package com.example.demo.lombokValidation.eh;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		try {
			int a=100;
			int b= 0;
			int result= 100/0;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException " + e.getMessage());	
		}
		
		System.out.println("Rest of the code..");

	}
}
