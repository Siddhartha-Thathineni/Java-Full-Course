package com.java.course.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> charactersSet = new TreeSet<>(characters);

		System.out.println("TreeSet" + charactersSet); // Maintains sorted order and no duplicates allowed

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet" + linkedHashSet); // Maintains insertion order and no duplicates allowed

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet" + hashSet); // Does not Maintain either insertion order or sorted order and no
													// duplicates allowed
	}
}
