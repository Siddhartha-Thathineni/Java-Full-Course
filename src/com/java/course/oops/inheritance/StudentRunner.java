package com.java.course.oops.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		
		/*Student student = new Student();
		student.setName("Siddhartha");
		student.setEmail("siddhu310@gmail.com");*/
		
		Employee emp = new Employee("Siddhu", "Senior Technical Consultant");
		// emp.setName("Siddhartha");
		emp.setEmail("siddhu310@gmail.com");
		emp.setPhoneNumber("9132667514");
		emp.setEmployeeGrade('A');
		emp.setTitle("Senior Technical Consultant");

		System.out.println(emp);
	}
}
