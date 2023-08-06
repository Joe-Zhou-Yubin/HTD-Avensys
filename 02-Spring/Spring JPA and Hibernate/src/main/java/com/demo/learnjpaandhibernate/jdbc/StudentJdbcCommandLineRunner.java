package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.student.*;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepo;
import com.demo.learnjpaandhibernate.student.springdatajpa.StudentSpringDataJpaRepo;
@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner{
	
//	@Autowired //binding dependencies
//	private StudentJdbcRepo repo;
	
//	@Autowired
//	private StudentJpaRepo repo;
	
	@Autowired
	private StudentSpringDataJpaRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(1,"Joe","Singapore"));//insert method
		repo.save(new Student(2,"Loe","India"));
		repo.save(new Student(3,"Moe","Japan"));
		repo.save(new Student(4,"Poe","Korea"));
		
		repo.deleteById(1l);
		
		System.out.println(repo.findById(2l));
		System.out.println(repo.findById(3l));
	}
	
}
