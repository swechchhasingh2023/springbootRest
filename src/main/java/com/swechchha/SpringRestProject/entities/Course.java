package com.swechchha.SpringRestProject.entities;

public class Course {
	private long id;
	private String titie;
	private String description;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String titie, String description) {
		super();
		this.id = id;
		this.titie = titie;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitie() {
		return titie;
	}

	public void setTitie(String titie) {
		this.titie = titie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titie=" + titie + ", description=" + description + "]";
	}
	
	
	
}
