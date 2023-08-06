package com.java.learnspringframework.dependencyInjection;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//dependency injection using constructors -- recommended
@Component
class Football{
	PlayerOne playerone;
	PlayerTwo playertwo;
	public Football(PlayerOne playerone, PlayerTwo playertwo) {
		super();
		this.playerone = playerone;
		this.playertwo = playertwo;
	}
	public String toString() {
		return "Using " + playerone + " and " +playertwo+" Dependencies";
	}
}
@Component
class PlayerOne{
	
}
@Component
class PlayerTwo{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionApplication3 {

	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionApplication3.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(Football.class));
		}

	}

}
