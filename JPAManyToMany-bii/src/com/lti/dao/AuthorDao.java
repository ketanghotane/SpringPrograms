package com.lti.dao;

import java.util.List;

import com.lti.model.Book;

public interface AuthorDao {
	
		public List<Book> readBookByAuthor(String authname);
		 
		public List<Book> readBookByISBN(long bookisbn);
		 
		public List<Book> readBookByPrice(int price);
    
		public List<Book> readBooks();
		
	
}
