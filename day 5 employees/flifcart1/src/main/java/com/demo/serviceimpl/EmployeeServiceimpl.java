package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Employee;
import com.demo.repository.MyLocalRepository;
import com.demo.service.EmployeeService;



@Service

public abstract class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	MyLocalRepository myLocalRepository;

	
	public Employee addEmployee(Employee employee) {
		
	Employee addemplcut = myLocalRepository.save(employee);
	return addemplcut; // returning to controller
	}
	 public List<Employee> getAllListOfEmployee() {
		List<Employee> listofemployee = myLocalRepository.findAll();
		return getAllListOfEmployee();
	 }
		
		public Employee updateEmployee(Employee employee, long id) {

			employee.setId(id);
			Employee updatedemployee = myLocalRepository.save(employee);

			return updatedemployee;

		}
	      /// delete service
		@Override
		public void deleteEmployeeById(long id) {
			
			myLocalRepository.deleteById(id);  //delete from table where id =?
		}

	}

