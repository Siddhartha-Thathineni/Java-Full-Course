package com.java.course.generics;

public class GenericsRestrictionsExample {

	// Restrictions applied for methods
	public static <X> X doubleValue(X value) {
		return value;
	}
	public static void main(String[] args) {
		
		MyCustomList2<Long> list = new MyCustomList2();
		list.addElement(5L);
		list.addElement(12L);
		System.out.println(list);

		Long longValue = list.get(0);
		System.out.println(longValue);

		MyCustomList2<Integer> list2 = new MyCustomList2();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(78));
		System.out.println(list2);

		Integer number = list2.get(0);
		System.out.println(number);
	}
}
