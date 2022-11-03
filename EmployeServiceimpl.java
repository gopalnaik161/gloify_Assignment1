package com.Gloifyassignment2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gloifyassignment2.EmployeeDAO.EmployeeDAO;
import com.Gloifyassignment2.entities.Employee;



@Service
public class EmployeServiceimpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
        employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
     Employee entity =employeeDao.getOne(parseLong);
     employeeDao.delete(entity);
	}

}
