package com.bridgeit.lazyEager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LEStudent")
public class Student {

@Id
@GeneratedValue
private int sId;

	private String name;

	@OneToMany(mappedBy="student",fetch=FetchType.EAGER)
	private Collection<Laptop> laptop=new ArrayList<>();
	
	public Student() {
		
	}
	
	public Collection<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}

	public int getsId() {
		return sId;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + "]";
	}


	
	
	
}
