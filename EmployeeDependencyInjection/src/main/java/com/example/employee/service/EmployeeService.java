package com.example.employee.service;

import java.util.List;

import com.example.employee.Employee.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
}

