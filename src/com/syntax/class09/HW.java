package com.syntax.class09;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
//
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter the start and end points respectiverly");
		int start = scan.nextInt();
		int end =scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		if (start<end) {
		for (int i=start; i<=end;i++) {
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd++i
			}
			}
		System.out.println("Sum of even numbers in frange from"+start+"to"+end+"is ")
		
		
		}
		
		
		
		
		
		
		
		

	}

}
