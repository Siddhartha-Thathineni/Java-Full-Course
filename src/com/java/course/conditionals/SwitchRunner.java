package com.java.course.conditionals;

import java.util.Scanner;

public class SwitchRunner {

	public static void main(String[] args) {

		puzzle1();
		puzzle2();
		puzzle3();

		Scanner scanner = new Scanner(System.in); // Read system input
		System.out.println("Enter Number 1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter Number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("Choice available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.println("Enter Choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your choices are ");
		System.out.println("Number 1 : " + number1);
		System.out.println("Number 2 : " + number2);
		System.out.println("Choice : " + choice);

		getOperationUsingSwitch(number1, number2, choice);
	}

	private static void getOperationUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result is " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result is " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
	}

	private static void puzzle1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
			// break; If not using break statement, then all the statements below the
			// statement gets executed
		case 3:
			System.out.println(3);
		default:
			System.out.println("Default");
		}
	}

	private static void puzzle2() {

		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2: // Fall through code
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle3() {

		int number = 10;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}