package com.java.course.generics;

import java.util.ArrayList;

public class MyCustomList2<T extends Number> {

	// We are restricting the subclasses to implement only of type Number

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
