package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/students to print details -- when url is loaded method should be loaded
@RestController
public class StudentController {//rest controller
	@RequestMapping("students")
	public List<Student> retrieveStudents(){
		return Arrays.asList(
				new Student(001,"Joe",20,"Singapore"),
				new Student(002,"Jo",19,"India"),
				new Student(003,"J",18,"America")
				);
	}
}
