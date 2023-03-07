package com.java.course.functional.programming.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {

		return number % 2 == 0;
	}
}
	class Print implements Consumer<Integer> {

		@Override
		public void accept(Integer number) {
			System.out.println(number);
		}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {

		return number * number;
	}
}
public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 6, 48).stream().filter(n -> n % 2 == 0).forEach(p -> System.out.println(p));
		// filter method takes a predicate

		// Implement above logic with
		// filter - Predicate
		// forEach - Consumer
		List.of(23, 43, 34, 45, 6, 48).stream().filter(new EvenNumberPredicate()).forEach(new Print());

		// Functional Interface for map
		List.of(23, 43, 34, 45, 6, 48).stream().filter(new EvenNumberPredicate()).map(n -> n * n).forEach(new Print());
		List.of(23, 43, 34, 45, 6, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new Print());
	}
}
