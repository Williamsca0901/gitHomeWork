package com.syntas.class13;



public class HW1 {

	public static void main(String[] args) {
		// Write a program that reads two people's first names
		// ask if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		String fathersName="Daniel";//6/2=3
		String mothersName="Mary";//4/2=2
		String isBoyGirl="boy";
		if (isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);// use to get any index
			System.out.println(firstPart+secondPart);
			
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		
		}
		}
		

	}


