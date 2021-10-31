package com.syntax.class04;

public class donorBlood {

	public static void main(String[] args) {
		int age=19;
		double weight=115;
		
		if (age>=18) {
			System.out.println("You are eligible to donate blood");
		if (weight>=120) {
			System.out.println("We can accept the patient");
			
		}else {
			System.out.println("You are not eligible to donate blood");
		    }
		}
	}	
}
