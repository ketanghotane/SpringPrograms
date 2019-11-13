package com.lti.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	private Address address; 
	private Address address2;
	
	public Employee(Address address){	
	this.address=address;
	}
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	
}
