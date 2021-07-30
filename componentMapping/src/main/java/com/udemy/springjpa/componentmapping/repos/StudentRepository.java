package com.udemy.springjpa.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springjpa.componentmapping.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
