package com.udemy.springjpa.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springjpa.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
