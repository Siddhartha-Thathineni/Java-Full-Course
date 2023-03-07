package com.java.course.oops.abstractclasses;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void cleanUp() {
		System.out.println("Switch off the Microwave");
		System.out.println("Clean up the Microwave");
	}

	@Override
	void prepareDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the Microwave");

	}

	@Override
	void getReady() {
		System.out.println("Get Raw materials");
		System.out.println("Switch on the Microwave");

	}
}
