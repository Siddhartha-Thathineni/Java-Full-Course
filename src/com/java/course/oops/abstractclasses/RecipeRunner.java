package com.java.course.oops.abstractclasses;

public class RecipeRunner {

	public static void main(String[] args) {
		RecipeOne recipe = new RecipeOne();
		recipe.execute();

		RecipeWithMicrowave recipe2 = new RecipeWithMicrowave();
		recipe2.execute();
	}
}
