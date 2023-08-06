package com.java.learnspringframework;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class springtest {

	public static void main(String[] args) {
		try(
		// 1. launch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		){
		// 2. configure things for spring to manage - config class
		//name @Bean is created
		
		// 3. Retrieve beans managed by Spring
		System.out.println("Hello "+context.getBean("name"));//access with bean name
		System.out.println("Age: "+ context.getBean("age"));
		System.out.println(context.getBean("student"));//customised beans
		System.out.println(context.getBean("addressOne"));
		System.out.println(context.getBean("addressSecond"));
		
//		System.out.println(context.getBean("cityaddress"));//changed bean name
//		System.out.println(context.getBean(Address.class));//alt way to get bean by class
		
//		System.out.println(context.getBeanDefinitionCount());//10 beans, 5 internal 5 createdd
//		System.out.println(context.getBeanDefinitionNames());
		
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //prints array of all beans
		} catch(BeansException e) {
			e.printStackTrace();
		}
	}

}
