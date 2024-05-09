package com.example.employeecompanytask.service;

import com.example.employeecompanytask.module.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> listOfEmployees(Long companyId);
}
