package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Employee;


@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testInsert() {
        Employee employee = new Employee();
        employee.setFirstname("John");
        employee.setLastname("Doe");
        employeeRepository.save(employee);
        // employeeRepository.findAll();
        // System.out.println("hello");
    }
}
