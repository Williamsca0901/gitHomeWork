package com.syntax.class05;

import java.util.Scanner;

public class LogicalEg {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Do you have a credit card?");
		
		String condition = input.next();
		
		if (condition.equals("yes")) {
			
		System.out.println("Please tell me the balance");
		double balance = input.nextDouble();
		
		if (balance>1000) {
			System.out.println("Pay it of immediately.");
			
	}else {
		System.out.println("You need to spend more?");
	}
	}else {
System.out.println("Would you like to get a credit card?");
	}

}
}