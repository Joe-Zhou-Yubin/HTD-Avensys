package com.java.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Student(String name, int age, Address address) {};
record Address(String address) {};


@Configuration
public class HelloWorldConfig {
	
	@Bean
	public String name() {
//		System.out.println("Name is ");
		return "Joe";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
//	public Student student() {
////		var student = new Student("Joe 1",21);
////		return student; Method 1
////		return new Student("Joe 1",21); Method 2
//		return new Student(name(),age(),address());
//	}
	
	public Student student(String name,int age,Address addressOne) {
		return new Student(name,age,addressOne);
	}
	
//	@Bean(name = "cityaddress")
//	public Address address() {
//		return new Address("Singapore");
//	}
	
	@Bean
	@Primary
	public Address addressOne() {
		return new Address ("Singapore");
	}
	
	@Bean
	@Qualifier("AddressSecond")
	public Address addressSecond() {
		return new Address("Bedok");
	}

}
