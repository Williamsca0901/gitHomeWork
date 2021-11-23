package com.syntax.class15;

public class SyntaxStudent {
	static String school="Syntax";
	int durationOfCourse=6;
	String name;
	String id;
	
	void calculateFee() {
		int currentMonth=3;
		double tax=.10;
		System.out.println(name+"has to pay "+currentMonth*1000+1000*tax);
		
	}

}
