package com.syntax.class07;

public class HWLoop {

	public static void main(String[] args) {
		// Print even numbers from 50 to 100
		int i=50;
		while (i<=80) {
			System.out.print(i + "");
			i+=2;
		}
		System.out.println();
		System.out.println( "ANOTHER WAY");
		int c = 50;
		while (c <= 60) {
			if (c % 2== 0) {
				System.out.print(c + "");	
			}
		c ++;
	}
     System.out.println("------END OF CODE--------");
	}
}
