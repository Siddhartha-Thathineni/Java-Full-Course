package com.java.course;

public class MultiplicationTable {	
	//5*1 = 5
	//5*10=50		
	void print () {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
		// print(5);
	}
	
	//Method Overloading - Same method name , Different types of Parameters
	void print(int table) {
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table,i,table*i).println();		
		}
	}
}
