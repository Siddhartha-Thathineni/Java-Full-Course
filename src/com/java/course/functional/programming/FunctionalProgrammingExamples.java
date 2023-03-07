package com.java.course.functional.programming;

import java.util.List;

public class FunctionalProgrammingExamples {

	public static void main(String[] args) {

		// Object oriented programming
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		// printBasic(list);
		printWithFunctionalProgramming(list);

		List<Integer> numbers = List.of(1, 4, 7, 9);
		numbers.stream().forEach(element -> System.out.println(element));
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	// Print with functional programming
	// For each of the stream list - > print element
	// Instead of looping, we are converting the list into a stream and telling it
	// to print out each element
	// We are sending a function code to forEach()
	private static void printWithFunctionalProgramming(List<String> list) {
		list.stream().forEach(element -> System.out.println("Element - " + element));
	}

}
