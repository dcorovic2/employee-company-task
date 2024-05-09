package com.example.employeecompanytask.dao;

import com.example.employeecompanytask.module.Employee;
import com.example.employeecompanytask.module.QEmployee;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findEmployeesByCompanyId(Long companyId) {
        final JPAQuery<Employee> query = new JPAQuery<>(entityManager);
        final QEmployee employee = QEmployee.employee;

        List<Employee> e = query.from(employee).where(employee.company.id.eq(companyId)).fetch();

        return query.from(employee).where(employee.company.id.eq(companyId)).fetch();
    }
}
