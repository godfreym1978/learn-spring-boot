package com.example.mysqlquery;

import org.springframework.data.repository.CrudRepository;

import com.example.mysqlquery.Employee;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}