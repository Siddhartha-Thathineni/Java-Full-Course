package com.java.course.functional.programming.streams.terminal;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsTerminalOperations {

	public static void main(String[] args) {
		// Terminal operations - max, min, filter, reduce, forEach, collect, toArray,
		// count, anyMatch, findFirst, findAny

		// max
		List<Integer> num = List.of(23, 12, 34, 53);
		num.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(num);

		// min
		List<Integer> num1 = List.of(23, 12, 34, 53);
		num.stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(num);
		
		//filter - identify elements which are odd numbers
		List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));

		// filter , collect - identify elements which are odd numbers and convert them
		// to another list
		List<Integer> num3 = List.of(23, 12, 34, 53);
		num3.stream().filter(e -> e % 2 == 1).collect(Collectors.toList()).forEach(p -> System.out.println(p));
		// System.out.println(num3);

		// filter , collect - identify elements which are even numbers and convert them
		// to another list
		List<Integer> num4 = List.of(23, 12, 34, 53);
		num4.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(p -> System.out.println(p));
		// System.out.println(num3);
	}
}
