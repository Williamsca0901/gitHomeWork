package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		
		int [] numbers= {10,11,22,33,44,55,66,77,88};
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]+" ");
			sum += numbers[i];
		}
		System.out.println("The sum of all integers = " + sum);
		sum=0;
		for (int num:numbers) {
			sum+=num;
		}
	System.out.println("The sum of all integers = "+sum);
}
	}


