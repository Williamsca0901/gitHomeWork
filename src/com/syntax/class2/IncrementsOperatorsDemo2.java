package com.syntax.class2;

public class IncrementsOperatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		 number= number + number + number + number ;
		System.out.println(number);
		number=number+10+20+20;
		System.out.println(number);
		System.out.println("***********************");
		number=10;
		number=number-number;
		System.out.println(number);//0
		number=10;
		number=number/10;  //10/10=1
		System.out.println(number);
		System.out.println("***********************");
		number=10;
		number--;   //10-1=9
		System.out.println(number);//10*10
		//number** not supported
		//number// not supported
		//number%% not supported

	}

}
