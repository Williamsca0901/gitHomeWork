package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean zoo=!false;
		System.out.println(zoo);
		
		boolean isRain=false;
		if(!isRain) {
			System.out.println("I will go for a walk");
			
		}

		String username="Test";
		String password="Password";
		
		if(!username.equals(password)) {
			System.out.println("I am accepting your password");
			
		}
		boolean selected=false;
		
		if (!selected) {
			System.out.println("do click");
			
		}
		
	}

}
