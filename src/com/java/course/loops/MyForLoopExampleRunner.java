package com.java.course.loops;

public class MyForLoopExampleRunner {

	public static void main(String[] args) {
		
		MyForLoopExample number = new MyForLoopExample(6);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN " + sum);

		int sumOfDivisor = number.sumofDivisors();
		System.out.println("sumOfDivisor " + sumOfDivisor);

		number.printNumberTriangle();
	}
}
