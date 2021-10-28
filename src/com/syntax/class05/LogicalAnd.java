package com.syntax.class05;
import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		boolean understandJava=false;
		boolean enjoyJava=false;
		
		if(understandJava && enjoyJava) {
			System.out.println("That is awesome");
		}else {
			System.out.println("You probably need to study more");
		}
/* 
 * ask user to enter a number
 * based on the entered # we will define is small, medium or large
 * 
 * if number is between 1and 10--> small
 * if number is between 11 and 100--> medium
 * if number is between 101 and 1000--> large
 * if number is more than 1001 --> xLarge
 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter any number");
		int num=input.nextInt();
		if (num<1) {
			System.out.println("Number is 0 or negative");
		}
		
		if(num>=1 && num<=10) {
			System.out.println(num+"is small");
		}else if (num>=11 && num<=100) {
			System.out.println(num+"is medium");
		}else if (num>=101 && num<=1000) {
			System.out.println(num+"is large");
		}else if(num>=1001) {
			System.out.println(num+"is xLarge");
			
		}
		
	}

}
