package com.Gloifyassignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Gloifyassignment2.Service.EmployeeService;
import com.Gloifyassignment2.entities.Employee;

@RestController
public class EmployeeDtls {
	
	@Autowired
	private EmployeeService employeeService;



	@GetMapping("/employees")
    public List<Employee> getEmployees(){
		
	return this.employeeService.getEmployee();
	
}
	
	@PostMapping("/Employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.employeeService.addEmployee(employee);
		
		
	}
	@PutMapping("/employee/{employeeId}")
	public Employee updateEemployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus>deleteEmployee(@PathVariable String employeeId ) {
		
		try {
			this.employeeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
		
	}
	
	
}