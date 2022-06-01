package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;



public interface EmployeeService {
	

	Employee addEmployee(Employee employee);
	
	// get all list of products
	static antlr.collections.List getAllListOfEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	//update by id 
	Employee updateEmployee(Employee employee,long id);
	
	/// delete service
	void deleteEmployeeById(long id);

}
