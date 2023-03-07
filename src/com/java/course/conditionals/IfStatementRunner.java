package com.java.course.conditionals;

public class IfStatementRunner {

	public static void main(String[] args) {

		puzzle(); // static method
		puzzle2();
		puzzle3();
		puzzle4();
		int i = 25;

		if (i == 25) {
			System.out.println("I is 25");
		} else {
			System.out.println("I is not 25");
		}

		// else-if
		i = 26;
		if (i == 25) {
			System.out.println("I is 25");
		} else if (i == 24) {
			System.out.println("I is 24");
		} else if (i == 27) {
			System.out.println("i is 27");
		} else if (i == 28) {
			System.out.println("i is 28");
		} else {
			System.out.println("The value of i is 26");
		}
	}

	private static void puzzle() {

		// Only one block of code is executed in a nested if (if-else) statement. So be
		// carefull
		int k = 15;
		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2); // Only this statement will execute
		} else if (k < 20) {
			System.out.println(3);
		} else if (k > 4) {
			System.out.println(4);
		} else {
			System.out.println(5);
		}
	}

	private static void puzzle2() {
		int l = 15;

		if (l < 20) {
			System.out.println("l<20"); // This will execute
		}
		if (l > 20) {
			System.out.println("l>20");
		} else {
			System.out.println("Who am I"); // This will execute
		}

	}

	private static void puzzle3() {
		int m = 15;
		if (m > 16) {
			if (m < 20) {
				System.out.println("m<20");
			} else {
				System.out.println("Who am I"); // This will execute
			}
		}
	}

	private static void puzzle4() {
		int number = 5;
		if (number > 5) {
			number = number + 10;
		}
		number++;
		System.out.println(number);
	}
}
