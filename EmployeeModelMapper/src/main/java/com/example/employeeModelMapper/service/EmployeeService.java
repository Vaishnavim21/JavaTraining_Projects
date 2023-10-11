package com.example.employeeModelMapper.service;

import com.example.employeeModelMapper.entity.*;
import com.example.employeeModelMapper.repository.*;
import com.example.employeeModelMapper.response.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
  
import java.util.Optional;
  
public class EmployeeService {
  
    @Autowired
    private EmployeeRepo employeeRepo;
  
    @Autowired
    private ModelMapper mapper;
  
    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }
  
}