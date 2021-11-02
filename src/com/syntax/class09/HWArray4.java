package com.syntax.class09;

public class HWArray4 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.
		int [] nums= {1125,1225,1325,1425,1525};
		int sum=0;
		for (int c=0; c<nums.length; c++) {
			sum += nums[c];
		}
			System.out.println("The sum of the array is "+sum);
		}

	}


