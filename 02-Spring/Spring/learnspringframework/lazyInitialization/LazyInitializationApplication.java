package com.java.learnspringframework.lazyInitialization;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component//eager initialization
class DemoOne{
	
}
@Component
@Lazy //lazy initialization not recommended
class DemoTwo{
	private DemoOne demoOne;
	public DemoTwo(DemoOne demoOne) {
		// some logic to execute even before initialization (criteria logic)
		System.out.println("Initialization code");
		this.demoOne = demoOne;
	}
}


@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(LazyInitializationApplication.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("initialization complete");
		}

	}

}
