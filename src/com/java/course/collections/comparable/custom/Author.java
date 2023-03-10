package com.java.course.collections.comparable.custom;

public class Author implements Comparable<Author> {

	String firstName;
	String lastName;
	String bookName;

	public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	@Override
	/*
	 * This is where we write the logic to sort. This method sort automatically by
	 * the first name in case that the last name is the same.
	 */
	public int compareTo(Author au) {
		/*
		 * Sorting by last name. compareTo should return < 0 if this(keyword) is
		 * supposed to be less than au, > 0 if this is supposed to be greater than
		 * object au and 0 if they are supposed to be equal.
		 */
		int last = this.lastName.compareTo(au.lastName);
		// Sorting by first name if last name is same d
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	}
}
