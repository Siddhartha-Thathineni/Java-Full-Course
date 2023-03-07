package com.java.course.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCaluculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCaluculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal caluculateTotalValue(int noOfYears) {
		// Total value = principal + principal * interest * noOfYears
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}
}
