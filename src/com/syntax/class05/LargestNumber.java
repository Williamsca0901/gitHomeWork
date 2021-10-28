package com.syntax.class05;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 number");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
	if (num1==num2 && num1==num3) {
		System.out.println("Numbers are equal");
	}else {
		
	} if (num1>=num2 && num1>num3) {
		System.out.println(num1+"is the largest number");
		
		if (num1%2==0) {
			System.out.println(num1+"is the even number");
		}else {
			
			
		}
	}else if (num2>=num3 && num2>num1) {
		System.out.println(num2+"is the largest number");
	}else if (num3>num2 && num3>=num1) {
		System.out.println(num3+"is the largest number");
		
		
	}
	}

}
