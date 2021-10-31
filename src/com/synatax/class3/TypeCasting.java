package com.synatax.class3;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=10;//define
		int number2;//define
		number2=(int)number; //assigning, explicit-narrowing big to small
		System.out.println(number2);
		
		int number3=10;
		double number4=number3;//implicit,widening small to big
		int number5=1234;
		byte number6=(byte)number5;
System.out.println(number6);

short number7=126;
byte number8=(byte)number7;

int number9=10000;
float f=number9;
long number12=(long)f;

double number10=10.5;
int number11=(int)number10;
System.out.println(number11);



		

	}

}
