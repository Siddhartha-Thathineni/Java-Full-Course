package com.java.course.referencevariables;

public class StringBufferExample {

	public static void main(String[] args) {

		// StringBuffer is Synchronized class and thread safe. Ideal for
		// multithreading environments
		StringBuffer sb = new StringBuffer("TEst");
		sb.append("123");
		System.out.println(sb);
		// System.out.print(sb.setCharAt(1, 'e'));
	}
}
