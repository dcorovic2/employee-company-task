package com.example.employeecompanytask.controller;


import com.example.employeecompanytask.module.Employee;
import com.example.employeecompanytask.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/employeeListForGivenCompanyId")
    public ResponseEntity<List<Employee>> filters(@RequestParam("companyId") Long companyId) {
        return ResponseEntity.ok(employeeService.listOfEmployees(companyId));
    }
}
