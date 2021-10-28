package com.syntax.class07;
import java.util.Scanner;
public class HW1 {

	public static void main(String[] args) {
	Scanner opSwitch=new Scanner (System.in);
	System.out.println("Please enter number 1");
	double a=opSwitch.nextDouble();
	
	System.out.println("Please enter your number2 ");
	double b = opSwitch.nextDouble();
	
	System.out.println("Please enter your operator");
	char op = opSwitch.next().charAt(0);
	
	double solve =0;
	switch (op) {
	case '*':
		solve = a * b;
		break;
	case '/':
		if (b!=0) {
			solve = a/b;
		}else {
			System.out.println("Cannot / by 0");
		}
		break;
	case '+':
		solve = a+b;
		break;
	case '-':
		solve = a-b;
		default:
			System.out.println("Entry is invalid");
	}
	System.out.println(solve);
	opSwitch.close();
	
	}
	}


