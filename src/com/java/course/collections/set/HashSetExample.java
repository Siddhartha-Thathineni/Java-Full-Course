package com.java.course.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();

		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		numbers.add(7);
		numbers.add(7);

		System.out.println(numbers);
		// O/P - [765432, 7654, 7, 76, 765, 76543]
		// HashSet does not maintain insertion order
		// HashSet does not maintain sorting order
		// HashSet does not allow duplicates
	}
}
