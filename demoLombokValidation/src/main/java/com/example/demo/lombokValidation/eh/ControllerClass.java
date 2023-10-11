package com.example.demo.lombokValidation.eh;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@PostMapping("/postStudentdetails")
	public String studentDetails(@RequestBody StudentDto student) throws InvalidFieldException{
		if (student.getName()==null) {
			throw new InvalidFieldException("Name is a required field");
		}
		return "Data is saved";
		}
	}
	

