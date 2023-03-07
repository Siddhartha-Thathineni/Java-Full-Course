package com.java.course.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayListExample {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public StudentArrayListExample(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {

		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// Sum
		// total and divide

		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP); // Rounding up and number of
																						// decimal points we need after
																						// the dot(96.)
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMark(int index) {
		marks.remove(index);
	}

	@Override
	public String toString() {
		return name + marks;
	}
}
