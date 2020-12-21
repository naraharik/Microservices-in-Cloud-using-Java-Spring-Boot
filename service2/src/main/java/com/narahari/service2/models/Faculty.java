package com.narahari.service2.models;

public class Faculty {
	
	private String Id;
	private String name;
	private String subject;
	
	private Faculty() {
		
	}

	public Faculty(String id, String name, String subject) {
		Id = id;
		this.name = name;
		this.subject = subject;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
