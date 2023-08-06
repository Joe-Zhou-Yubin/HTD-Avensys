package com.java.learnspringframework.postandpre;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class NormalClass{
	private Dependency dependency;

	public NormalClass(Dependency dependency) {
		super();
		this.dependency = dependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct // after construction of beans
	public void initialize() {
		dependency.getReady();
	}
	@PreDestroy // before destroy beans
	public void cleanup() {
		dependency.cleanup();
	}
	
}

@Component
class Dependency{
	public void getReady() {
		System.out.println("Some Logic using Dependencies");
	}
	public void cleanup() {
		System.out.println("Cleaning up");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationApp {

	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext(PrePostAnnotationApp.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//		context.getBean(NormalClass.class).initialize();
//		context.getBean(NormalClass.class).cleanup();

	}

}
