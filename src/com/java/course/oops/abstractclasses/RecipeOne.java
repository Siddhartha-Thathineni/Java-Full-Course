package com.java.course.oops.abstractclasses;

public class RecipeOne extends AbstractRecipe {

	@Override
	void cleanUp() {
		System.out.println("Clean up the kitchen");
	}

	@Override
	void prepareDish() {
		System.out.println("Do the Dish");

	}

	@Override
	void getReady() {
		System.out.println("Get Raw materials");
		System.out.println("Get Utensils ready");

	}
}
