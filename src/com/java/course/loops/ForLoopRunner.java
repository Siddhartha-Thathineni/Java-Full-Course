package com.java.course.loops;

public class ForLoopRunner {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}
		for (int i = 11; i <= 10; i = i + 2) { // Won't execute
			System.out.print(i + " ");
		}
	}
}
