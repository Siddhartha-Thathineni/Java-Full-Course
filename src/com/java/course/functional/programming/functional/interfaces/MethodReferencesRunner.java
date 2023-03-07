package com.java.course.functional.programming.functional.interfaces;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		// Shorter code using method references
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		// Shorter code using method references
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven)
				// .max((n1, n2) -> Integer.compare(n1, n2))
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;

	}
}
