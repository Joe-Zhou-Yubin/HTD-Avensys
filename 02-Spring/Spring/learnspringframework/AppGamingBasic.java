package com.java.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.learnspringframework.game.GameRunner;
import com.java.learnspringframework.game.GamingConsole;
import com.java.learnspringframework.game.MarioGame;
import com.java.learnspringframework.game.SuperContra;
@Configuration
public class AppGamingBasic {

//	public static void main(String[] args) {
		
	@Bean
	public GamingConsole game() {	
		var game = new MarioGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);
//		gameRunner.run(); tight coupling
		
//		var game = new SuperContra();
////		var gameRunner = new GameRunner(SuperContra); error since gamerunner is tightly coupled to MarioGame
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();//loose couple way
//		
//		var game1 = new MarioGame();//object creation of mariogame
//		var gameRunner1 = new GameRunner(game1);//object creation of gamerunner and wiring the dependencies
//		gameRunner1.run(); //mariogame can also run in loose coupling
		
		

//	}

}
