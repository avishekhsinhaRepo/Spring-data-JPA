package com.udemy.springjpa.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springjpa.idgenerators.entities.Employee;
import com.udemy.springjpa.idgenerators.repos.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setName("John");
		employeeRepository.save(employee);
	}

}
