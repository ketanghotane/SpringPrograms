package com.lti.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Author;
import com.lti.model.Book;
import com.lti.service.AuthorServiceImpl;
import com.lti.service.AuthorSevice;



public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		AuthorSevice service= new AuthorServiceImpl();
		Book b= new Book();
		b.setISBN(1001);
		b.setPrice(150);
		b.setTitle("Wings of Fire");
		
		Author auth= new Author();
		auth.setAuthorId(101);
		auth.setName("APJ Abdul Kalam");
		 manager.getTransaction().begin();
		 manager.persist(auth);
		 manager.persist(b);
		 manager.getTransaction().commit();
		 
		
		
		
		
	}

}
