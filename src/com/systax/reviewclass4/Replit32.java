package com.systax.reviewclass4;

import java.util.Scanner;

public class Replit32 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter your gender: M or F");
		    String gender=scan.next();
		    System.out.println("Please enter your age");
		    int age=scan.nextInt();
		    if(age>25 && gender.equals("F")){
		      System.out.println("Woman");
		    } else if(age>25 && gender.equals("M")) {
		      System.out.println("Man");
		    }
		    if(age<25 && gender.equals("F")) {
		      System.out.println("Girl");
		    } else if(age<25 && gender.equals("M")) {
		      System.out.println("Boy");
		 }

	}
	}
	
