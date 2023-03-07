package com.java.course.oops.constructors;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(120);

		System.out.println("Ducati Speed is : " + ducati.getSpeed());
		System.out.println("Honda Speed is : " + honda.getSpeed());

		ducati.start();
		honda.start();
	}

}
