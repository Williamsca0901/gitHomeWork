package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {
		// Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. 
		//Retrieve all values from that array using 2 different loops
		String [][] groceries = {
				{" carrot", " broccoli", " bell pepper", " tomato"},
				{" mangoe"," apple", " banana"," pear"},
				{" milk", " yogurt", " chocolate", "ice-cream"},
		};
		for (String []grocery:groceries) {
			for (String g:grocery) {
				System.out.print(g +" , ");
			}
			System.out.println();
		}
			System.out.println("get all elements using regular for loop ");
			for (int i=0; i<groceries.length; i++) {
				for (int g=0; g<groceries[i].length; g++) {
					System.out.print(groceries[i][g]+ " , ");
				}
				System.out.println();
			
		}
	}
	}


	
