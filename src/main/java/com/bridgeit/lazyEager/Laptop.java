package com.bridgeit.lazyEager;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LELaptop")
public class Laptop {

	@Id
	@GeneratedValue
	private int lId;

	private String brand;

	@ManyToOne(cascade=CascadeType.ALL)
	private Student student;

	public Laptop() {
		
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop(String brand) {
		super();
		this.brand = brand;
	}

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


	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brand=" + brand + ", student=" + student + "]";
	}

}
