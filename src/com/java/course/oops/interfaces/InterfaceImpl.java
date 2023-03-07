package com.java.course.oops.interfaces;

public class InterfaceImpl implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void doSomething() {

		System.out.println("doSomething implementation of concrete(Implementation) class");
	}

	public static void main(String[] args) {
		InterfaceA objA = new InterfaceImpl();
		InterfaceB objB = new InterfaceImpl();
		InterfaceC objC = new InterfaceImpl();

		// all the method calls below are going to same concrete implementation
		objA.doSomething();
		objB.doSomething();
		objC.doSomething();
	}
}
