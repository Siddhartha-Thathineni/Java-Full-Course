package com.java.course.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		String str = "This is a great day for me and this never happenned to me before";
		Map<Character, Integer> occurrences = new HashMap<>();

		char[] characters = str.toCharArray();

		for (char character : characters) {
			// Get the character
			// if the character is present, we increment the algorithm
			// We initiliaze to 1 if the character is not there
			Integer integer = occurrences.get(character);
			if (integer == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, integer + 1);
			}
		}
		System.out.println(occurrences);
	}
}
