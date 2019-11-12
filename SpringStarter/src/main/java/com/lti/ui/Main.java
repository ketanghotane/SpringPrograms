package com.lti.ui;

import com.lti.model.Address;
import com.lti.model.Employee;

public class Main {

	public static void main(String[] args) {
	
		Employee employee = new Employee(1001, "Prajwal", 50000);
		Address address = new Address("Pune", "Nigidi", "411044");
		//employee.setAddress(address);
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
	
	}

}
