package com.syntax.class07;
import java.util.Scanner;
public class HW2 {

	public static void main(String[] args) {
		System.out.println("Calculator using if statement");
		
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter two number and operator(+,-,*,/");

		double i = in.nextDouble();
		double q = in.nextDouble();
		
		String oper = in.next();
		double solution=0.0;
		
		if (oper.equalsIgnoreCase("+")) {
	solution = i + q;
		}else if (oper.equalsIgnoreCase("-")) {
			solution = i+q;
		}else if (oper.equalsIgnoreCase("*")) {
			solution = i*q;
		}else if (oper.equalsIgnoreCase("/")) {
			solution = i/q;
		}else {
			System.out.println("wrong operator");
		}
		System.out.println("Solution"+solution);
	}		
}




	


