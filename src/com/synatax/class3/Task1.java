package com.synatax.class3;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add,subtract,multiply and divide 2 decimal
		 * values.Your program should say
		 * "The______of 2 numbers ____and ____is equal to ____"
		 */
		double num1 = 10.50;
		double num2 = 10.50;
		double sum=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		System.out.println("The Addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The Subtration of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The Multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mul);
		System.out.println("The Division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
	
	}

}
