package com;

public class Students {
	private int id;

	private String name;
	private String classname;
	private String email;
	
	
	public Students() {
		super();
		}
	
	// constructor
	public Students(int id, String name,String classname,String email) {
	super();
	this.id = id;
	this.name =name;
	this.classname=classname;
	this.email = email;
	}


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
