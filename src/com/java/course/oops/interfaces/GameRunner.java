package com.java.course.oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// Mariogame game = new Mariogame();

		// Polymorphism - Possible with interfaces - One interface , multiple
		// implementations is called Polymorphism
		// GamingConsole game = new ChessGame();
		// GamingConsole game = new Mariogame();

		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
