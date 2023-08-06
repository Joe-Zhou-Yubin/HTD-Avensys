package com.java.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.learnspringframework.game.GameRunner;
import com.java.learnspringframework.game.GamingConsole;
import com.java.learnspringframework.game.MarioGame;
import com.java.learnspringframework.game.SuperContra;

public class GamingApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(AppGamingBasic.class)){
			context.getBean(GameRunner.class).run();
		}catch (BeansException e) {
			e.printStackTrace();
		}
		
		
	}

}
