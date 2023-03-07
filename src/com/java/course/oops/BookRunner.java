package com.java.course.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(10);
		System.out.println("Art Of Computer Programming Copies " + artOfComputerProgramming.getNoOfCopies());
		artOfComputerProgramming.increaseNoOfCopies(30);
		System.out.println(
				"New Increased Art Of Computer Programming Copies " + artOfComputerProgramming.getNoOfCopies());

		effectiveJava.setNoOfCopies(20);
		System.out.println("Effective Java Copies " + effectiveJava.getNoOfCopies());
		effectiveJava.increaseNoOfCopies(30);
		System.out.println("New Increased Effective Java Copies " + effectiveJava.getNoOfCopies());

		cleanCode.setNoOfCopies(30);
		System.out.println("Clean Code Copies " + cleanCode.getNoOfCopies());
		cleanCode.increaseNoOfCopies(45);
		System.out.println("New Increased Clean Code Copies " + cleanCode.getNoOfCopies());

	}
}
