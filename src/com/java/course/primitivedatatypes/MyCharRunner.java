package com.java.course.primitivedatatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		CharacterExample example = new CharacterExample('U'); // false
		System.out.println(example.isVowel());

		System.out.println(example.isConsonent());

		System.out.println(example.isDigit());
		System.out.println(example.isAlphabet());

		CharacterExample.printLowerCaseAlphabets(); // We are not using any data from class or an
																		// object. We
																// use static method in this kind of situation
		CharacterExample.printUpperCaseAlphabets(); // For calling static methods, we don't need to
																		// create and object and call the methods in
																		// other class. We can directly use the class
																		// name to call the methods.
																		// EX - CharacterExample.methodName()

		char ch = 'a';
		System.out.println(ch);

		char newLine = '\n';
		System.out.println(newLine);

		char ch2 = '\u0022';
		System.out.println(ch2);

		char ch3 = '\u00A2';
		System.out.println(ch3);

		char tab = '\t';
		System.out.println(tab);

		char ch4 = '\u00A9';
		System.out.println(ch4);
	}
}
