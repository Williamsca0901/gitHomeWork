package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order
		double[] numbers = { 10.55, 07.99, 11.88, 22.66 };
		System.out.println(numbers.length);
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// from last element to first
		for (int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		//we cannot use enhance for loop to travel back in an array
		//for each loops always i direction: start ->end
		
		
		
	}
	

}
