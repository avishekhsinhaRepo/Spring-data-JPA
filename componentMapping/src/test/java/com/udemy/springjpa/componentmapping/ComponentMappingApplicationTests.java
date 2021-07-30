package com.udemy.springjpa.componentmapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springjpa.componentmapping.entities.Address;
import com.udemy.springjpa.componentmapping.entities.Student;
import com.udemy.springjpa.componentmapping.repos.StudentRepository;

@SpringBootTest
class ComponentMappingApplicationTests {
	
	@Autowired
	StudentRepository studentRepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreateStudent() {
		Address address = new Address();
		Student employee = new Student();
		employee.setId(1);
		employee.setName("John");
		address.setCity("New Delhi");
		address.setCountry("INDIA");
		address.setState("DELHI");
		address.setZip("90210");
		address.setStreetAddress("XYZ");
		employee.setAddress(address);
		studentRepo.save(employee);
		
	}

}
