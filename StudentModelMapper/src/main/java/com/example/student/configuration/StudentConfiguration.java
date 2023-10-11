package com.example.student.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
  
@Configuration
public class StudentConfiguration {
  
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
    
    @Bean
    public String someStringBean() {
        return "Not Saved";
    } 
  
}