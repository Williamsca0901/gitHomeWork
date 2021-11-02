package com.syntax.class09;

public class AllFormArray {

	public static void main(String[] args) {
		int[]num= {100, 200, 300, 400, 500};
		for (int i=0; i<num.length; i++) {
		System.out.print(num[i]+ " ");
		}
		//to access all elements for an array we can use for each loop/advance for loop/enhance
		for(int n:num) {
			System.out.println(n);
	}
		String[] colors = {"red", "blue", "white"};
		for (String col: colors) {
			System.out.println(col);
		}
	}
}
