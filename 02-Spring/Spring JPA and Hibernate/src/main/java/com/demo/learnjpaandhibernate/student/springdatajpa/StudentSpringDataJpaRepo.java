package com.demo.learnjpaandhibernate.student.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.learnjpaandhibernate.student.Student;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepo;

public interface StudentSpringDataJpaRepo extends JpaRepository<Student, Long>{
	
	
}
