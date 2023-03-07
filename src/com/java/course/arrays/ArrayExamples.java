package com.java.course.arrays;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

		int[] marks = { 76 + 84 + 84 };
		int sum = 0;

		for (int mark : marks) {
			sum = sum + mark;
		}
		System.out.println("Total marks : " + sum);

		int[] marks2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < marks2.length; i++) { // loop and print one by one
			System.out.println(marks2[i]);
		}

		System.out.println(Arrays.toString(marks2)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

		//Initializing arrays
		int[] mark3 = new int[5]; // initial values = {0,0,0,0,0}

		// Compare , Sort and fill arrays
		int[] marks4 = { 100, 98, 97, 95, 96, 91 };
		for (int mark4 : marks4) { // Enhanced for loop - // loop and print one by one
			System.out.println(mark4);
		}

		int[] marks6 = new int[5]; // Fill Arrays with values
		Arrays.fill(marks, 100);

		// Compare arrays
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 3, 2, 3 };
		System.out.println(Arrays.equals(array1, array2));
		// System.out.println(Arrays.sort(array2)); // Sort arrays

	}
}