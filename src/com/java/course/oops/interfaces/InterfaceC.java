package com.java.course.oops.interfaces;

public interface InterfaceC extends InterfaceA, InterfaceB {

	@Override
	// same method is declared in InterfaceA and InterfaceB both
	public void doSomething();

}
