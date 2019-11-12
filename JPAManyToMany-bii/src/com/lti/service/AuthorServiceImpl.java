package com.lti.service;

import java.util.List;

import com.lti.dao.AuthorDao;
import com.lti.model.Book;

public class AuthorServiceImpl implements AuthorSevice{
	
	AuthorDao dao=null;

	@Override
	public List<Book> findBookByAuthor(String authname) {
		
		List<Book> list=dao.readBookByAuthor(authname);
		return list;
		
	}

	@Override
	public List<Book> findBookByISBN(long bookisbn) {
		List<Book> list=dao.readBookByISBN(bookisbn);
		return list;
	}

	@Override
	public List<Book> findBookByPrice(int price) {
		List<Book> list=dao.readBookByPrice(price);
		return list;
	}

	@Override
	public List<Book> findBooks() {
		List<Book> list=dao.readBooks();
		return list;
	}

	
	
	

}
