package com.syntax.reviewclass5;

public class Task9 {

	public static void main(String[] args) {
		// max and min number in the array

		int[] numbers = { 10, 5, 3, -5, 15 };
		int largestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largestNumber) {
				largestNumber=numbers[i];
			}
			if (numbers[i]<smallestNumber){
				smallestNumber=numbers[i];
			}
		
		}
		System.out.println(largestNumber);
		System.out.println(smallestNumber);
	}

}
