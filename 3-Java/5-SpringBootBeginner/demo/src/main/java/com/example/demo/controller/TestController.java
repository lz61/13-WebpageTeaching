package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

// 注意: 是RestController而不是Controller!
@RestController
@RequestMapping("/test") // /test表示访问路径,完整路径为: localhost:[portNum]/test
public class TestController {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping("") // 二级路径
    public String test() throws IOException {
        Employee employee = new Employee();
        employee.setFirstname("John");
        employee.setLastname("Doe");
        employee.setId(123);
        employeeRepository.save(employee);
        return "hello123";
    }
}