package com.udemy.springjpa.idgenerators.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Employee {
	
	@TableGenerator(name = "employee_gen", table = "id_gen",pkColumnName = "gen_name", valueColumnName = "gen_col", allocationSize = 100)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
