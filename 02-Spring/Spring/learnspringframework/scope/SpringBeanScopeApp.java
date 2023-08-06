package com.java.learnspringframework.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //without scope: singleton design pattern
class GeneralClass{
	
}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component // many object instances but it is only per container
class PrototypeClass{
	
}


@Configuration
@ComponentScan
public class SpringBeanScopeApp {

	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext(SpringBeanScopeApp.class);
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));//different hashcode
		
		System.out.println(context.getBean(GeneralClass.class));
		System.out.println(context.getBean(GeneralClass.class));
	}

}
