package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//supermarket//dependency injection using fields
//customerone
//customertwo -- dependencies
@Component
class SuperMarket{
	@Autowired
	CustomerOne customerOne;
	@Autowired
	CustomerTwo customerTwo;
	
	public String toString() {
		return "Using " + customerOne +" and " +customerTwo + " Dependencies";
	}
}
@Component
class CustomerOne{
	
}
@Component
class CustomerTwo{
	
}

@Configuration
@ComponentScan//no need to use if its in same class
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//1 spring container
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionApplication.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(SuperMarket.class));
		}
	}

}
