package com.java.learnspringframework.jakarta;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.java.learnspringframework.scope.SpringBeanScopeApp;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named //jakarta version
class BusinessClass{
	private Data data;
	
	//@Autowired//Dependency
	@Inject
	public void setData(Data data) {
		System.out.println("Setter injection");
		this.data = data;
	}
	
	public Data getData() {
		return data;
	}
}

//@Component
@Named
class Data{
	
}

@Configuration
@ComponentScan
public class JakartaApp {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(JakartaApp.class);){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessClass.class));
		}

	}

}
