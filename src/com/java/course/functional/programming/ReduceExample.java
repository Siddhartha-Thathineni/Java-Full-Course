package com.java.course.functional.programming;

import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(4, 6, 8, 13, 3, 15);
		// Stream and caluculate the sum of all all numbers
		// Reduce method
		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("Sum of total numbers: " + sum);

		// Filter only odd numbers and print the sum of odd numbers
		List<Integer> list1 = List.of(4, 6, 8, 13, 3, 15);
		// Stream and caluculate the sum of all all numbers
		// Reduce method
		int sum1 = list1.stream().filter(element -> element % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("Sum of odd numbers: " + sum1);

		// Filter only odd numbers and print the sum of Even numbers
		List<Integer> list2 = List.of(4, 6, 8, 13, 3, 15);
		// Stream and caluculate the sum of all all numbers
		// Reduce method
		int sum2 = list2.stream().filter(element -> element % 2 == 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("Sum of even numbers: " + sum2);
	}
}
