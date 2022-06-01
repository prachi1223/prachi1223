package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private String employeename;
	private String dateofbirth;
	private int employeeage;
	private String mobileno;
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getage11() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getage1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getage() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
