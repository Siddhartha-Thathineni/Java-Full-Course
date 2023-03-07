package com.java.course.oops.examples;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Polar", 5.0, "Blue");
		// fan.isOn(true);
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);

	}
}
