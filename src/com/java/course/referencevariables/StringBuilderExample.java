package com.java.course.referencevariables;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder is not synchronized and not thread safe and used when not
		// worried about multithreading
		StringBuilder sb = new StringBuilder("Siddhartha");
	}
}
