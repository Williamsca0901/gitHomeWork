package com.systax.reviewclass4;
import java.util.Scanner;
public class Replit35 {

	public static void main(String[] args) {
		System.out.println("Do you need a loan?");
		Scanner scanner=new Scanner(System.in);
		boolean isLoanRequired=scanner.nextBoolean();
		if(isLoanRequired) {
			System.out.println("What is your credit score");
			int creditScore=scanner.nextInt();
	
			System.out.println("unknown");
			if (creditScore<600) {
				System.out.println("Not eligible");
			}else if (creditScore>=600 && creditScore<=700) {
				System.out.println("Maybe eligible");
			}else if (creditScore>=701 && creditScore<=800) {
				System.out.println("Eligible");
			}
		}else {
			System.out.println("The eliginility is Definitely eligible");
		}
	}else {
		System.out.println("unknown");
			}
		}
		

	}


