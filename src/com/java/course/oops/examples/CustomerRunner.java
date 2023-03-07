package com.java.course.oops.examples;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Austin", "78681");
		Customer customer = new Customer("Siddhu", homeAddress);

		Address workAddress = new Address("line 2", "Round Rock", "78681");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}
