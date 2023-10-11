package com.example.student.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
	
    private int id;
    
    @NotBlank(message="name should not be blank")
    @Size(min= 4,max= 50, message="name should be minimum 4 and maximum 50")
    private String name;
    private String email;
    private int age;
    private Boolean isActive;
    private Boolean isDeleted;
    
}

