package com.bridgeit.todo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TODOLabel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int labeId;
	
	
	private String name;

	public int getLabeId() {
		return labeId;
	}

	public void setLabeId(int labeId) {
		this.labeId = labeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
