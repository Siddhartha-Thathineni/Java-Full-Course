package com.java.course.oops.constructors;

public class Book {

	private String bookName;

	public Book(String bookName) {
		this.bookName = bookName;
	}

	public Book() {
		this.bookName = "Java full course";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
