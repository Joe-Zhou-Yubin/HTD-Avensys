package com.demo.learnjpaandhibernate.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // create entity to utilise spring jpa -- no need for queries
public class Student {
	
	@Id
	private long id;
	
	@Column(name = "name")//map to column
	private String name;
	
	@Column (name = "address")
	private String address;
	
	public Student() {
		
	}
	
	public Student(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
