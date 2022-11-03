package com.Gloifyassignment2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue
	
	private long id;
	
	@Column(name="name" , nullable =false)
	private String name;
	
	@Column(name="Date" , nullable =false)
	private int Date;
	
	


	

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}

	@Column(name="email", nullable=false)
	private String email;
	
	
	
	@Column(name="age", nullable=false)
	private int age;
	
	@Column(name="salary", nullable=false)
	private long salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	};
	
	
	

}

