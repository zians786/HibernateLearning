package com.bridgeit.lazyEager;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Laptop {
	
	@Id
	private int lId;
	
	private String brand;

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@ManyToOne
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
