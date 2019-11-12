package com.lti.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
	Employee employee= (Employee)context.getBean("employee2",Employee.class);
	Employee employee1= (Employee)context.getBean("employee3",Employee.class);
	
	EmployeeService service = context.getBean("service", EmployeeService.class);
		boolean result= service.addEmployee(employee);
		boolean result1= service.addEmployee(employee1);
	/*if(result)
		System.out.println("Employee added succesfully");

	
	else
		System.out.println("Not added");
	*/
	List<Employee> list= service.findAllEmployees();
	System.out.println(list);
	
	}
}
