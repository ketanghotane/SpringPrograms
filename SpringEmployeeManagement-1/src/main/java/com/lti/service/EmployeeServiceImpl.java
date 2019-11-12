package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService,InitializingBean, DisposableBean{

	private EmployeeDao dao;
	
	public boolean addEmployee(Employee employee) {
		return dao.createEmployee(employee);
		
	}
	
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	public List<Employee> findAllEmployees(Employee employee) {
		
		return dao.readAllEmployees(employee);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("IN Init");
		
	}

	public void destroy() throws Exception {
	System.out.println("Destroyed");
	}

	public EmployeeServiceImpl() {
		System.out.println("object of emplserv created");
	}

	public List<Employee> findAllEmployees() {
		return dao.readAllEmployees();
		
	}
	
	


}
