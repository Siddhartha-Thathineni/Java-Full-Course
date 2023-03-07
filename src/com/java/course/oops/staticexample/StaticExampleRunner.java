package com.java.course.oops.staticexample;

public class StaticExampleRunner {

	public static void main(String[] args) {
		StaticExample staticExample = new StaticExample("Siddhu");

		StaticExample.printName(); // printName is a static method. We don't need to create an object to access the
									// method

		staticExample.setName("Navya");
		System.out.println(staticExample.getName());

		System.out.println(staticExample.printUpperCase(staticExample.getName()));
	}
}
