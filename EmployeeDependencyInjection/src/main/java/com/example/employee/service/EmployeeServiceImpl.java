package com.example.employee.service;

import org.springframework.stereotype.Service;

import com.example.employee.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    private long nextEmployeeId = 1L;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null; // Return null if no employee with the given ID is found
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(nextEmployeeId);
        employeeList.add(employee);
        nextEmployeeId++;
        return employee;
    }
}
