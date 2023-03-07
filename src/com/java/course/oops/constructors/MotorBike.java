package com.java.course.oops.constructors;

public class MotorBike {

	private int speed;

	public MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}
}
