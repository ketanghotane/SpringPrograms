package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.lti.model.Book;


public class AuthorDaoImpl implements AuthorDao {

	EntityManager manager;
	
	
	public AuthorDaoImpl() {
	
	}

	@Override
	public List<Book> readBookByAuthor(String authname) {
		
		return null;
	}

	@Override
	public List<Book> readBookByISBN(long bookisbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> readBookByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> readBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
