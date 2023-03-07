package com.java.course.functional.programming;

import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {

		// Object oriented programming
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog", "Rat", "That");
		// printBasic(list);
		printBasicWithFiltering(list);
		printWithFunctionalProgramming(list);
		
		printWithFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println("Basic filtering - " + string);
			}
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

	// Only pickup elements in the list that end with "at"
	// Filtering the elements to go into forEach loop to perform action
	// Use filter method before sending the list into forEach loop
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("Filtering Element - " + element));
	}

}
