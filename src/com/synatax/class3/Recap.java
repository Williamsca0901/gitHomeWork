package com.synatax.class3;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1 = " Hello world ";
		int number1 = 10;
		String result = var1 + number1;
		System.out.println(result);
		boolean isTrue = true;
		System.out.println(isTrue + result);
		System.out.println("**********");
		int number2 = 14;
		int number3 = 3;
		System.out.println(number2 / number3);
		System.out.println(number2 % number3);
		System.out.println("***********");
		double number4 = 14;
		double number5 = 3;
		System.out.println(number4 / number5);// 4.6666
		System.out.println(number4 % number5);// 2.0
		System.out.println("***********");
		int number6 = -100;
		number6++;
		System.out.println(number6);
		number6--;
		System.out.println(number6);
//number**not allowed because it does not change anything
//number//not allowed because it does not change anything
		System.out.println("*********");
		double number7 = 10;
		number7++;
		System.out.println(number7);
		System.out.println("*******");
		double number8 = 20;
		number8 += 10;//20+10=30
		System.out.println(number8);
		System.out.println("*********");
		number8 -= 40;//30-40=-10
		System.out.println(number8);
		System.out.println("*********");
		number8 = 10;
		number8 %= 4;//10/4=2, remainder2
		System.out.println(number8);

	}

}
