package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// 注意: 是RestController而不是Controller!
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employees") // /test表示访问路径,完整路径为: localhost:[portNum]/test
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("")// 二级路径
    public Employee addEmployee(@RequestBody Employee employee) throws IOException {
        employeeRepository.save(employee);
        return employee;
    }
}