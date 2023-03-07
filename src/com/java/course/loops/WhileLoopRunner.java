package com.java.course.loops;

public class WhileLoopRunner {

	public static void main(String[] args) {

		int i = 6;
		while (i <= 8) {
			System.out.println(i);
			i++;
		}
		WhileLoop player = new WhileLoop(90);
		player.printSquaresUptoLimit();
		player.pringCubersUptLimit();
	}
}
