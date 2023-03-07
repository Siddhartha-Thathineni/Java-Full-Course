package com.java.course.oops;

public class MotorBike {

	// state
	// instance variable
	private int speed;
	// behavior

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // local Variable

		// System.out.println(speed); // 100
		// System.out.println(this.speed); // 0 default speed which is assigned
		this.speed = speed; // instance variable
		// System.out.println(this.speed); // 100
	}

	public void increaseSpeed(int newSpeed) {
		this.speed = this.speed + newSpeed;
	}
}
