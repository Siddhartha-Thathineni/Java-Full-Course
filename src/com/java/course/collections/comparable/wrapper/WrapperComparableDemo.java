package com.java.course.collections.comparable.wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WrapperComparableDemo {

	public static void main(String[] args) {
		/*
		 * Integer class implements Comparable Interface so we can use the sort method
		 */
		int[] arr = { 98, 5, 445, 21, 3, 6, 98, 45, 2, 74 };
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorting : " + Arrays.toString(arr));

		/*
		 * String class implements Comparable Interface so we can use the sort method
		 */
		String[] names = { "Navya", "Thathineni", "Siddhartha", "Yemperala" };
		System.out.println("String Array before sorting : " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("String Array after sorting : " + Arrays.toString(names));

		List fruits = List.of("Blackberries", "Cantaloupe", "Cherries", "Apple", "Banana");
		List<String> fruitsAl = new ArrayList<>(fruits);

		System.out.println("Fruits ArrayList before sorting : " + fruitsAl);
		Collections.sort(fruitsAl);
		System.out.println("Fruits ArrayList after sorting : " + fruitsAl);

		/*
		 * In the above example, you have seen that how easy it is to sort the Arrays
		 * and list of objects that implements Comparable interface, you just need to
		 * call the Collections.sort (and Arrays.sort). However if you want to sort the
		 * objects of custom class then you need to implement the Comparable interface
		 * in our custom class.
		 */
	}
}
