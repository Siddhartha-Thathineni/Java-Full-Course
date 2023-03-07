package com.java.course.primitivedatatypes;

public class CharacterExample {

	private char c;

	public CharacterExample(char c) {
		this.c = c;
	}

	public boolean isVowel() {

		/*
		 * if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
		 */
		// Or we can implement as below
		if (c == 'a' || c == 'A')
			return true;
		if (c == 'e' || c == 'E')
			return true;
		if (c == 'i' || c == 'I')
			return true;
		if (c == 'o' || c == 'O')
			return true;
		if (Character.toUpperCase(c) == 'U') // use a method to check the condition
			return true;
		return false;
	}

	public boolean isDigit() {
		if (c >= 48 && c <= 57) // between 0 (48) and 9(57)
		return true;
		return false;
	}

	public boolean isAlphabet() {
		if (c >= 97 && c <= 122) // between a (97) and z(122)
			return true;
		if (c >= 65 && c <= 90) // between A (65) and Z(90)
			return true;
		return false;
	}

	public boolean isConsonent() {
		// it is an alphabet and not a vowel = true
		if (isAlphabet() && !isVowel())
		return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}

