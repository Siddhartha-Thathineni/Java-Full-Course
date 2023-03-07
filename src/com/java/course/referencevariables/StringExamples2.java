package com.java.course.referencevariables;

public class StringExamples2 {

	public static void main(String[] args) {
		String string = "Navya Yemparala";
		System.out.println(string.concat(" is my wife")); // Navya Yemparala is my wife

		System.out.println(string); // Navya Yemparala, The value does not change
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());

		String string2 = " Navya Yemparala ";
		System.out.println(string2);
		System.out.println(string2.trim());
		System.out.println(string2.replace("Yemparala", "Thathineni"));
	}
}
