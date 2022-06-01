package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Employee;
import com.demo.service.EmployeeService;

import antlr.collections.List;

@RestController
public class EmployeeController {
	
        @Autowired
       EmployeeService employeeservice;
        
        @PostMapping(value="/addemployee")
        Employee addEmployee(@RequestBody Employee empl) {
        Employee E = employeeservice.addEmployee(empl);
        System.out.println(" Employee->>>>> " + empl.getEmployeename());// print on server side
		System.out.println("dateofbirth->>>>>" + empl.getDateofbirth());
        System.out.println(" age->>>>> " + empl.getage());
		System.out.println(" mobile->>>>> " + empl.getMobileno());
		return empl;

        	
        }
        @GetMapping(value ="/viewallemployee")
       List viewAllListOfEmployee() {
        	
        	return EmployeeService. getAllListOfEmployees();
        }
        

        @PutMapping(value="/updateemployee/{id}")
    	Employee updateEmployee(@RequestBody Employee updateemployee,@PathVariable long id) {

        	Employee updatedDetails= employeeservice.updateEmployee(updateemployee, id);
    	
    		
    	 return updatedDetails;
    	 
    	}
    	
        @DeleteMapping(value = "/deletemployeebyid/{employeeid}")
    	ResponseEntity<String> deleteEmployeeBy(@PathVariable long employeeid) {
    		try {

    			if (employeeid == 0) {

    				return ResponseEntity.ok("pls enter in proper id " + employeeid);

    			}
    			employeeservice.deleteEmployeeById(employeeid);

    			return ResponseEntity.ok("Sucessfully deleted " + employeeid);

    		} catch (Exception e) {

    			return ResponseEntity.ok("Employee id does not exists " + employeeid);
    		}
    	}

    }

    	
    	
    

        
        
        
        
        
        
