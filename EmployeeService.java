package com.Gloifyassignment2.Service;

import java.util.List;

import com.Gloifyassignment2.entities.Employee;

public interface EmployeeService {
	
	public List<Employee>getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

}
