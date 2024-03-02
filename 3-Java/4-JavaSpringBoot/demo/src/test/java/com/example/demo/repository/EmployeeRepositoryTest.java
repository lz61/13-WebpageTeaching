package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee(){
        Employee employee = new Employee();
        employee.setFirstname("John");
        employee.setLastname("Doe");
        employeeRepository.save(employee);
    }
}