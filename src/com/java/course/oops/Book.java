package com.java.course.oops;

public class Book {

	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(int newCopies) {
		setNoOfCopies(this.noOfCopies + newCopies);
	}

	public void decreaseNoOfCopies(int newDecreasedCopies) {
		setNoOfCopies(this.noOfCopies + newDecreasedCopies);
	}

}
