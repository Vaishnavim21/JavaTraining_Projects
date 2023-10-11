package com.example.demo.lombokValidation.eh;

import lombok.Data;
@Data
 public class StudentDto{
	private Integer id;
	private String name;
	private String address;
	private Boolean isActive;
	private Integer percentage;
		
}
