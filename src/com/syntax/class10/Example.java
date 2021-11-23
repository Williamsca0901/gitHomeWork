package com.syntax.class10;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// I want to create an array and store elements using Scanner
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside array of cars");
		int size=scan.nextInt();
		String [] cars=new String[size];
		
		//storing elements inside an array of cars
		for (int i=0; i<cars.length; i++) {
			System.out.println("Please enter your cars");
			  cars[i]=scan.next();
		}	 
		// retrieve all stored elements
		for(String car : cars) {
			System.out.print(car+"");
		}
	System.out.println(cars[0]);
	}
	

}
