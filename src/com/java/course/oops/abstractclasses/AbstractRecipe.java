package com.java.course.oops.abstractclasses;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		prepareDish();
		cleanUp();
	}

	abstract void cleanUp();

	abstract void prepareDish();

	abstract void getReady();
}
