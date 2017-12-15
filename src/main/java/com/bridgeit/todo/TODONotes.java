package com.bridgeit.todo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class TODONotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer noteId;
	


	private String title;
	
	private String description;
	
	private String image;

	@ManyToOne(cascade=CascadeType.ALL)
	private TODOUser user;

	
	@JoinTable(name = "TOLabel", joinColumns = {@JoinColumn(name = "noteId")}, inverseJoinColumns = {@JoinColumn(name = "labelId")})
	@ManyToMany(cascade=CascadeType.ALL)
	private List<TODOLabel> label;
	
	public List<TODOLabel> getLabel() {
		return label;
	}

	public void setLabel(List<TODOLabel> label) {
		this.label = label;
	}

	private boolean isArchived;

	private boolean inTrash;

	private String color =null;

	private boolean isPinned=false;

	

	public Integer getNoteId() {
		return noteId;
	}

	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public TODOUser getUser() {
		return user;
	}

	public void setUser(TODOUser user) {
		this.user = user;
	}

	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public boolean isInTrash() {
		return inTrash;
	}

	public void setInTrash(boolean inTrash) {
		this.inTrash = inTrash;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPinned() {
		return isPinned;
	}

	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}


	
	
	
	



	
	
}
