package com.java.course.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExamples {

	public static void main(String[] args) {

		// Java 8 brought some new time API changes
		// LocalDate, LocalDateTime, LocalTime
		System.out.println("LocalDate");
		System.out.println("-------------------------------");
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getMonthValue());
		System.out.println(now.isLeapYear());
		System.out.println(now.plusDays(100));

		System.out.println("LocalDateTime");
		System.out.println("-------------------------------");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		System.out.println("LocalTime");
		System.out.println("-------------------------------");
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}
}
