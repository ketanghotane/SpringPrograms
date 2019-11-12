package com.lti.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Author")
public class Author implements Serializable {
	
	
	@Id
	private int authorId;
	private String name;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="BookAuthor",joinColumns={@JoinColumn(name="authorId")},inverseJoinColumns={@JoinColumn(name="ISBN")})
	private Set<Book> books= new HashSet<>();

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", books=" + books + "]";
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addBook(Book book){
		

	}
	public Author(int authorId, String name, Set<Book> books) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.books = books;
	}
	
	

}
