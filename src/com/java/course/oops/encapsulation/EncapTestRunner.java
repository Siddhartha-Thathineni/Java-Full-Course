package com.java.course.oops.encapsulation;

public class EncapTestRunner {

	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setAge(31);
		encap.setIdNum("1");
		encap.setName("Siddhartha Thathineni");
		System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge() + " Id : " + encap.getIdNum());
	}
}
