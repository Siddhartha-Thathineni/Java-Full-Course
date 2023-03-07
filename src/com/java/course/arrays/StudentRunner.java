package com.java.course.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 98, 95, 91, 99, 100 };

		Student student = new Student("Siddhu", marks);

		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum Marks : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum Marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average is : " + average);

		student.addNewMark();
		student.removeMark();
	}
}
