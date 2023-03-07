package com.java.course.loops;

public class WhileLoop {

	private int limit;

	public WhileLoop(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.print(i*i + " ");
			i++;
		}
		System.out.println();
	}

	public void pringCubersUptLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}
}
