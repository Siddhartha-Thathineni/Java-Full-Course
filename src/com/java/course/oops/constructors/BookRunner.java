package com.java.course.oops.constructors;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book("Art of Programming");
		System.out.println("Book created using Java Constructor : " + book.getBookName());

		Book bookDefault = new Book();
		System.out.println("Book created using Java Default Constructor : " + bookDefault.getBookName());
	}
}
