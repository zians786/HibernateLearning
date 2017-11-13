package com.bridgeit.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Embed")
public class UserEmbeddableExample {

	@Id
	private int id;
	private FullName name;
	private String email;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public FullName getName() {
		return name;
	}
	public void setName(FullName name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserEmbeddableExample [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
