package com.java.course.functional.programming.streams.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsIntermediateOperations {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		// print the squares of first 10 numbers
		IntStream.range(1, 11).forEach(p -> System.out.println(p));

		IntStream.range(1, 11).map(e -> e * e).forEach(p -> System.out.println(p));

		//Print lower case of strings
		List<String> strings = List.of("Apple", "Ant", "Bat");
		
		strings.stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));

		// print the length of each string
		strings.stream().map(s -> s.length()).forEach(p -> System.out.println(p));

		IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
	}
}
