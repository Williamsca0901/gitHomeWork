package com.syntax.class10;

public class HW2Class10 {

	public static void main(String[] args) {
		// Create a 2D array in which first array will consist of 4 names and second array will contain grades. 
		//Then your program should print name of the students that has A and B grade
		String[][] names = {
			{" John ", " Jack ", " Jenny ", " Jerry "},
			{"A","B"},
		};
		System.out.println(names [0][0]+"grade is "+ names[1][0]);
		System.out.println(names [0][1]+"grade is "+ names[1][1]);
		System.out.println(names [0][2]+"grade is "+ names[1][0]);
		System.out.println(names [0][3]+"grade is "+ names[1][1]);
	
	}
}
