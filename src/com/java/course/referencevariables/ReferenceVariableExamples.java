package com.java.course.referencevariables;

public class ReferenceVariableExamples {

	public static void main(String[] args) {

		// Reference variable example

		ReferenceVariableExamples cat = null; // null is stored
		System.out.println(cat);
		cat = new ReferenceVariableExamples();
		System.out.println(cat);

		ReferenceVariableExamples dog = cat; // Memory location of reference variable cat gets stored into dog.
		System.out.println(dog);

		// Primitive variable example

		int i = 5;
		int j = i;
		System.out.println(j);
	}
}
