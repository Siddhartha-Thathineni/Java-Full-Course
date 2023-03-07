package com.java.course.wrapper.classes;

public class WrapperClassExamples {

	public static void main(String[] args) {

		Integer integer = new Integer(5);
		Integer integer1 = new Integer("5234");

		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5); // i1==i2 - false
		Integer i3 = Integer.valueOf(5); // i3==14 - true
		Integer i4 = Integer.valueOf(5);

		// Autoboxing
		Integer seven = 7;
	}
}
