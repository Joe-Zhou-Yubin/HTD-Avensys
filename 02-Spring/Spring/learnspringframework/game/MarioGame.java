package com.java.learnspringframework.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Jumping");
	}
	public void down() {
		System.out.println("Diving");
	}
	public void left() {
		System.out.println("Back");
	}
	public void right(){
		System.out.println("Forward");
	}

}
