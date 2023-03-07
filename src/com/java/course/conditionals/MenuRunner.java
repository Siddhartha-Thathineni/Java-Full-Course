package com.java.course.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
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

		if (choice == 1) {
			System.out.println("Result is " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Result is " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Result is " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("Result is " + (number1 * number2));
		} else {
			System.out.println("Invalid Operation");
		}
	}
}
