package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {
		// Create 2D array of cars : american, german, korean, italian.
		// Then retrieve all values from that array using 2 different loops
		
		String[][] cars = { 
				{ " American ", " German ", "Korean", " Italian " },
				{ " Ford ", "BMW", "Kia", " Ferrari" },
		};
		
		for (String []car:cars) {
			for (String m:car) {
				System.out.print(m +" , ");
			}
			System.out.println();
		}	
		
		System.out.println("get all elements using regular for loop ");
	
		for (int i=0; i<cars.length; i++) {
			for (int m=0; m<cars[i].length; m++) {
				System.out.print(cars[i][m]+ " , ");
			}
			System.out.println();
		
	}
	}
}
