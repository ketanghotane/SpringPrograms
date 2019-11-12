package com.lti.service;

import java.util.List;

import com.lti.model.Book;

public interface AuthorSevice {

	
		public List<Book> findBookByAuthor(String authname);
		public List<Book> findBookByISBN(long bookisbn);
		public List<Book> findBookByPrice(int price);
		public List<Book> findBooks();
		
}
