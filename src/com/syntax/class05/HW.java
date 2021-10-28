package com.syntax.class05;
import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Write customer age");
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("Congratulations we can provide DL");
		}else {
			System.out.println("Unfortunately we cannot provide DL");
			
			
			
		}

	}

}
