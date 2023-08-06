//package com.java.learnspringframework.dependencyInjection;
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//
//@Component
//class JavaClass{
//	StudentOne studentone;
//	StudentTwo studenttwo;
//	@Autowired
//	public void setStudentone(StudentOne studentone) {
//		System.out.println("Setter injection - one dependency");
//		this.studentone = studentone;
//	}
//	@Autowired
//	public void setStudenttwo(StudentTwo studenttwo) {
//		System.out.println("Setter injection - two dependency");
//		this.studenttwo = studenttwo;
//	}
//}
//@Component
//class StudentOne{
//	
//}
//@Component
//class StudentTwo{
//	
//}
//@Configuration
//@ComponentScan
//public class DependencyInjectionApplication2 {
//
//	public static void main(String[] args) {
//		try (var context = 
//				new AnnotationConfigApplicationContext(DependencyInjectionApplication2.class);)
//		{
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//			System.out.println(context.getBean(JavaClass.class));
//		}
//
//	}
//
//}
