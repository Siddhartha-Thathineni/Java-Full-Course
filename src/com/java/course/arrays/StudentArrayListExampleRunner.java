package com.java.course.arrays;

import java.math.BigDecimal;

public class StudentArrayListExampleRunner {

	public static void main(String[] args) {

		int[] marks = { 98, 95, 91, 99, 100 };

		StudentArrayListExample studentExample = new StudentArrayListExample("Siddhu", marks);

		int number = studentExample.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);

		int sum = studentExample.getTotalSumOfMarks();
		System.out.println("Sum of Marks : " + sum);

		int maximumMark = studentExample.getMaximumMark();
		System.out.println("Maximum Marks : " + maximumMark);

		int minimumMark = studentExample.getMinimumMark();
		System.out.println("Minimum Marks : " + minimumMark);

		BigDecimal average = studentExample.getAverageMarks();
		System.out.println("Average is : " + average);

		System.out.println(studentExample);

		studentExample.addNewMark(89);
		System.out.println(studentExample);
		studentExample.removeMark(1);
		System.out.println(studentExample);
	}
}
