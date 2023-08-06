package com.demo.learnspringboot;

public class Student {
	private int id;
	private String name;
	private int age;
	private String country;
	
	public Student(int id, String name, int age, String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
	

}
