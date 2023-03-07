package com.java.course.collections.comparable.custom;

import java.util.ArrayList;
import java.util.Collections;

public class AuthorSortRunner {

	public static void main(String[] args) {

		ArrayList<Author> authorList = new ArrayList<Author>();
		authorList.add(new Author("Henry", "Miller", "Tropic of Cancer"));
		authorList.add(new Author("Adolf", "Hitler", "Mein Campf"));
		authorList.add(new Author("Tolkein", "JRR", "Lord of the Rings"));
		authorList.add(new Author("George RR", "Martin", "Game of Thrones"));
		authorList.add(new Author("JK", "Rowling", "Harry Potter"));
		authorList.add(new Author("Frank", "Miller", "300"));

		Collections.sort(authorList);

		for (Author str : authorList)
			System.out.println(str.bookName + " Written By " + str.firstName + " " + str.lastName);
	}
}
