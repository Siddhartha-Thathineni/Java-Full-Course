package com.java.course.referencevariables;

public class StringExamples {

	public static void main(String[] args) {

		// Text is represented by a class called String
		String str = "TEST"; // Instance of TEST is stored in the reference of it in str
		str.length(); // index starts with 0
		System.out.println(str.length());
		System.out.println(str.charAt(2));

		String bigString = "This is a lot of text";
		System.out.println(bigString.substring(5));
		System.out.println(bigString.substring(5, 15)); // Character at index 15 is not a part of sub string

		String individualStrings = "Siddhartha Thathineni";
		System.out.println(individualStrings.length());

		for (int i = 0; i < individualStrings.length(); i++) {
			System.out.println(individualStrings.charAt(i));
		}

		// Find out if a specific string is present in a string
		System.out.println(individualStrings.indexOf("Thathi")); // 11
		System.out.println(individualStrings.charAt(5)); // a
		System.out.println(individualStrings.indexOf("i")); // 1
		System.out.println(individualStrings.lastIndexOf('i')); // 20
		System.out.println(individualStrings.contains("Sid")); // true
		System.out.println(individualStrings.startsWith("Thathi"));// false
		System.out.println(individualStrings.endsWith("i")); // true
		System.out.println(individualStrings.isEmpty()); // false
		System.out.println(individualStrings.equals("Siddhu")); // false
		System.out.println(individualStrings.equals("Siddhartha Thathineni")); // true
		System.out.println(individualStrings.equalsIgnoreCase("SIDDHARTHA THATHINENI")); // true
	}
}
