package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Address;
import com.lti.model.Employee;

public class Main2 {

	public static void main(String[] args) {
	
		/*Employee employee = new Employee(1001, "Prajwal", 50000);
		Address address = new Address("Pune", "Nigidi", "411044");*/
		//employee.setAddress(address);
		ApplicationContext context=  new ClassPathXmlApplicationContext("spring-config.xml");
		
		
		
		//Employee employee=(Employee)context.getBean("employee") ;
		Employee employee= context.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		System.out.println("-------------------------=============----------------");
		Employee employee2= context.getBean("employee",Employee.class);
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
	
	}

}
