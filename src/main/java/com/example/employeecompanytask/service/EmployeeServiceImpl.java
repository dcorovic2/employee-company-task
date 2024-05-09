package com.example.employeecompanytask.service;

import com.example.employeecompanytask.dao.EmployeeDao;
import com.example.employeecompanytask.exceptions.ResourceNotFoundException;
import com.example.employeecompanytask.module.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> listOfEmployees(Long companyId) {
        List<Employee> employees = employeeDao.findEmployeesByCompanyId(companyId);

        if (employees.isEmpty()) {
            throw new ResourceNotFoundException("Employees under company ID " + companyId + " not found");
        }

        return employees.stream().toList();
    }
}
