package com.java.course.oops.interfaces;

public class Mariogame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Goes Up");
	}

	@Override
	public void down() {
		System.out.println("Jump Down");
	}

	@Override
	public void left() {
		System.out.println("Move Left");
	}

	@Override
	public void right() {
		System.out.println("Move Right");
	}

}
