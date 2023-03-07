package com.java.course.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Integer> numbers = new LinkedHashSet<>();

		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		numbers.add(7);
		numbers.add(7);

		System.out.println(numbers);
		// O/P - [765432, 76543, 7654, 765, 76, 7]
		// LinkedHashSet maintains insertion order
		// LinkedHashSet does not maintain sorting order
		// LinkedHashSet does not allow duplicates
	}
}
