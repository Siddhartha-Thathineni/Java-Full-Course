package com.java.course.primitivedatatypes;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {

		BigDecimal number1 = new BigDecimal(34.2234);
		System.out.println(number1); // Output - 34.223399999999998044586391188204288482666015625

		BigDecimal number2 = new BigDecimal("34.2234");
		System.out.println(number2); // Output - 34.2234

		System.out.println(number1.add(number2));

		// BigDecimal is immutable
		int i = 5;
		BigDecimal number3 = number2.add(new BigDecimal(i));
		System.out.println(number3);
	}
}
