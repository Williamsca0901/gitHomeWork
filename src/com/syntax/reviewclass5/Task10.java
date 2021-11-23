package com.syntax.reviewclass5;

public class Task10 {

	public static void main(String[] args) {
		// this is enhanced loop
		// write a find the second largest number in the array?
		int[] numbers = { 15,10,17,13,30 };
		int largest= Integer.MIN_VALUE;
		int secondLargest = Integer.MAX_VALUE;

for(int number:numbers) {
	
	if (number>largest) {
		secondLargest=largest;
		largest=number;
	}else if(number>secondLargest && largest!=number) {
		secondLargest=number;
	}
	System.out.println("Largest"+largest);
	System.out.println("Second Largest"+secondLargest);
}
	}

}
