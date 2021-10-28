package com.syntax.class05;
import java.util.Scanner;

public class LargestNumberEnhancement {

	public static void main(String[] args) {

				
				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter 3 number");
				double num1 = scan.nextDouble();
				double num2 = scan.nextDouble();
				double num3 = scan.nextDouble();
				
				double largest=0;
				
			if (num1==num2 && num1==num3) {
				largest=num1;
				
			} else if (num1>=num2 && num1>num3) {
				largest=num2;
				
			} else if (num1%2==0) {
					largest=num3;
			}
			
		boolean isEven;
		
		if(largest%2==0) {
			isEven=true;
		}else {
			isEven=false;
					
		System.out.println(largest+"number is even"+isEven);
				
				
			}
			}

		

	}


