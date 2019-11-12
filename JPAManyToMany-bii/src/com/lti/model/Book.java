package com.lti.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Books")
public class Book implements Serializable{
	
	@Id
	private long ISBN;
	private String title;
	private int price;
	
	@ManyToMany(mappedBy="books")
	
	private Set<Author> author= new HashSet<>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long iSBN, String title, int price, Set<Author> author) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

 public void addBook(Author author)
 {
	 
 }
	
	
	

}
