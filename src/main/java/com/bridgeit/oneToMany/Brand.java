package com.bridgeit.oneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	
	public Brand(String name) {
		super();
		this.name = name;
	}
	
	@Id
	@GeneratedValue
	private int bId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="brand")
	private List<Phone> phone=new ArrayList<>();
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phone> getPhone() {
		return phone;
	}
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
}
