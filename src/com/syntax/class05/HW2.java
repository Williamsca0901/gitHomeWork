package com.syntax.class05;
import java.util.Scanner;
public class HW2 {

	public static void main(String[] args) {

		Scanner scan =new Scanner (System.in);
		System.out.println("How many year have you worked?");
		int year = scan.nextInt();
		if (year>=5) {
			System.out.println("You get a bonus");
			System.out.println("What is your salary?");
			int salary = scan.nextInt();
			if(salary>50000) {
			System.out.println("Your bonus is 5000");
			}else {
			System.out.println("Your bonus is 3000");
			}		
			}else {
				
			System.out.println("You are not eligible for bonus");
			
						
					}
		}
	}

