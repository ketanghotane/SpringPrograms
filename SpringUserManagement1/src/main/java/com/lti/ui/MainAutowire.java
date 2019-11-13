package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.model.Users;
import com.lti.service.UserService;

public class MainAutowire {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAutowire.xml");
		
		UserService service = context.getBean("service", UserService.class);
		Users user = context.getBean("user",Users.class);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Choose one from the following");
		System.out.println("1. Insert User");
		System.out.println("2. Update User");
		System.out.println("3. Delete User");
		System.out.println("4. Display Users");
		System.out.println("5. Find users by username");
		System.out.println("6. Find users by Firstname");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1: 
			System.out.println("Enter username:");
			user.setUsername(s.next());
			System.out.println("Enter password:");
			user.setPassword(s.next());
			System.out.println("Enter first name:");
			user.setFirstname(s.next());
			System.out.println("Enter first name:");
			user.setLastname(s.next());
			System.out.println("Enter mobile number:");
			user.setMobilenumber(s.next());
			
			boolean result= service.addUser(user);
			if(result){
				List<Users> list= service.findAllUsers();
				for(Users u: list)
					System.out.println(u);
			}else
				System.out.println("User not inserted");
			
			break;
		case 2:
			
			
			
			
			
			break;
		case 4: 
			List<Users> lst=service.findAllUsers();
			for(Users u: lst)
				System.out.println(u);
			break;
			
		default:
			System.out.println("Invalid choice");
		}
		
		
		
	}

}
