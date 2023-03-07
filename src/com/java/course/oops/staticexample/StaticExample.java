package com.java.course.oops.staticexample;

public class StaticExample {

	private static String name;

	public StaticExample(String name) {
		this.name = name;
	}

	public static void printName() {
		System.out.println(name);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticExample.name = name;
	}

	public String printUpperCase(String name) {
		return name.toUpperCase();
	}
}
