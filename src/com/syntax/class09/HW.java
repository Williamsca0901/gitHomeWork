package com.syntax.class09;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the start and end points respectively");
		int start = scan.nextInt();
		int end = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		if (start < end) {

			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd = +i;
				}
			}
			System.out.println("Sum of even numbers in range from" + start + "to" + end + "is " + sumEven);
			System.out.println("Sum of odd numbers in range from" + start + "to" + end + "is " + sumOdd);
		} else {
			System.out.println("Please enter start point less than end point");

		}
	}
}
