package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

// class: Employee,Long
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}