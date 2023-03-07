package com.java.course.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		System.out.println("Ducati speed is " + ducati.getSpeed());

		honda.setSpeed(80);
		System.out.println("Honda speed is " + honda.getSpeed());

		/*
		 * increase the speed of ducati by 100
		 * 
		 * int ducatiSpeed = ducati.getSpeed(); ducatiSpeed = ducatiSpeed + 100;
		 * ducati.setSpeed(ducatiSpeed); System.out.println("Ducati new speed is " +
		 * ducati.getSpeed());
		 * 
		 * // Do the same to honda int hondaSpeed = honda.getSpeed(); hondaSpeed =
		 * hondaSpeed + 80; honda.setSpeed(hondaSpeed);
		 * System.out.println("Honda new speed is " + honda.getSpeed());
		 */

		// Do the above speed increasing logic using a method
		ducati.increaseSpeed(100);
		System.out.println("Ducati new speed created using method is " + ducati.getSpeed());
		honda.increaseSpeed(80);
		System.out.println("Honda new speed created using method is " + honda.getSpeed());

	}
}
