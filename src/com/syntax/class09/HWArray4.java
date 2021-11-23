package com.syntax.class09;

public class HWArray4 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.
		int [][] nums={
			{2,2,2,2},
		{3,3,3,3},
	};

		int sum=0;
		for (int c=0; c<2; c++) {
			for (int d=0; d<4; d++) {
			sum += nums[c][d];
			}
			System.out.println("The sum of the array is "+ sum);
		}		
	}
	}


	
	

