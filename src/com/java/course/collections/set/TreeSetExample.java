package com.java.course.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		numbers.add(7);
		numbers.add(7);

		System.out.println(numbers);
		// O/P - [765432, 76543, 7654, 765, 76, 7]
		// TreeSet does not maintain insertion order
		// TreeSet maintains sorting order
		// TreeSet does not allow duplicates

		TreeSet<Integer> treeSet = new TreeSet<>(Set.of(65, 54, 32, 75, 4, 28));
		System.out.println(treeSet);

		// Element lower than 40
		
		System.out.println(treeSet.floor(40)); // 32

		System.out.println(treeSet.lower(32)); // 28

		System.out.println(treeSet.ceiling(54)); // 54

		System.out.println(treeSet.subSet(28, 54)); // 28,32
	}

}
