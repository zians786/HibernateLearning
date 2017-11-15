package com.bridgeit.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Books {
	
public Books(String title) {
		super();
		this.title = title;
	}
public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
@Id
@GeneratedValue
private int bId;
private String title;
private List<Teacher> teacher =new ArrayList<>();
}
