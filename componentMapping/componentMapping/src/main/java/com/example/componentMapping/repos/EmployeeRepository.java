package com.example.componentMapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.componentMapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
