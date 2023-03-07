package com.java.course.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsMethodRestrictionsExample {

	// Restrictions applied for methods
	public static <X> X doubleValue(X value) {
		return value;
	}

//Any class that extends list can use this method
	public static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	// Wild Card - Upper Bound example
	// We can pass any list(Integer, double, floating point numbers)
	public static double sumOfNumberList(List<? extends Number> numbers) {

		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {

		// calling restricted method here
		String string = doubleValue(new String("Siddhartha"));
		System.out.println(string);

		Integer number = doubleValue(Integer.valueOf(5));
		System.out.println(number);

		ArrayList list1 = doubleValue(new ArrayList<>());
		System.out.println(list1);

		ArrayList numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);

		LinkedList numbers1 = new LinkedList<>(List.of(1, 2, 3));
		duplicate(numbers1);
		System.out.println(numbers1);
	}
}
