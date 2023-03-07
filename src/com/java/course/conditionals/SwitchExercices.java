package com.java.course.conditionals;

public class SwitchExercices {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(1));
		System.out.println(determineNameOfMonth(11));
		System.out.println(determineIsWeekDay(6));
	}

	private static boolean determineIsWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		}
		return false;
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return "Invalid Day";
	}

	private static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
}
		return "Invalid Month";
	}
}
