package com.java.course.functional.programming;

import java.util.List;

public class FilteringNumbersExample {

	public static void main(String[] args) {

		// Stream and filter odd numbers and print odd numbers
		List<Integer> numbers = List.of(1, 4, 7, 9);
		numbers.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("Odd Numbers : " + element));

		// Stream and filter odd numbers and print even numbers
		List<Integer> numbersList = List.of(1, 4, 7, 9);
		numbersList.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even Numbers : " + element));
	}
}
