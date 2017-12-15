package com.bridgeit.manyToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue
	private int tId;
	private String tName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Books> book=new HashSet<>();
	
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Set<Books> getBook() {
		return book;
	}
	public void setBook(Set<Books> book) {
		this.book = book;
	}
	public Teacher(String tName, Set<Books> book) {
		super();
		this.tName = tName;
		this.book = book;
	}
	
	
	

}
