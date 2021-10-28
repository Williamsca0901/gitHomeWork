package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/* ask user to enter today's date
		 * if monday or friday--> no class
		 * if tuesday or wednesday--> manual class
		 * if saturday or sunday --> java class
		 * 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		if (day.equals ("monday")|| day.equals ("friday"));
		System.out.println("no class");
		
	if (day.equals ("tuesday")|| day.equals ("wednesday")) { 
		System.out.println("manual class");
		
	}else if (day.equals ("saturday")|| day.equals ("sunday")) {
		System.out.println("java class");

	}else {
		System.out.println("Wrong input");
	
	}
	}
	
	}

