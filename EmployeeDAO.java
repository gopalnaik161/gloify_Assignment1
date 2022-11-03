package com.Gloifyassignment2.EmployeeDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gloifyassignment2.entities.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
