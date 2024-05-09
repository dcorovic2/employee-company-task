package com.example.employeecompanytask.dao;

import com.example.employeecompanytask.module.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findEmployeesByCompanyId(Long companyId);
}
