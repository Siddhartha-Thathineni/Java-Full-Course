package com.java.course.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return Integer.compare(s1.getId(), s2.getId());
	}
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1,"Siddhu"), 
				new Student(93, "Navya"), new Student(6, "Siddhartha"));

		List<Student> studentsAL = new ArrayList<>(students);

		System.out.println("Before Sorting: " + studentsAL);

		// Use Comparable interface for sorting (Refer Student class)
		Collections.sort(studentsAL);

		System.out.println("After Sorting Ascending Order: " + studentsAL);

		Collections.sort(studentsAL, new DescendingStudentComparator());

		System.out.println("DescendingStudentComparator Order: " + studentsAL);
	}
}
