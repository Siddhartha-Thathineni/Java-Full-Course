package com.java.course.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCaluculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCaluculator simpleInterestCaluculator = new SimpleInterestCaluculator("4500.00", "7.5");
		
		BigDecimal totalValue = simpleInterestCaluculator.caluculateTotalValue(5); // 5 years
		System.out.println(totalValue);
	}
}
