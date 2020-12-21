package com.narahari.service1.models;

public class Student {
	
	private String Id;
	private String name;
	private String dept;
	
	
	public Student()
	{
		
	}
	
	
	public Student(String id, String name, String dept) {
		Id = id;
		this.name = name;
		this.dept = dept;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
