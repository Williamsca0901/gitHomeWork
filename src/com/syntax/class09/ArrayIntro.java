package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		System.out.println("******************");
		
		int[] array = new int[4];//container that holds values of same type int and int not double or byte
		array[1] = 10;
		array[2] = 13;
		array[3] = 14;
		System.out.println(array[2]+array[0]);
		System.out.println(array[3]);
		//I need to create array will hold 3 elements and double type of values
		double[]arr=new double[3];// storing 3 elements inside and array we named arr
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		// can I replace value from an array
		arr[1]=100.99;
		System.out.println("After changing value of an element "+arr[1]);
		
		String[]colors=new String[4];// no -4 negative array
		
		colors[1]="Red";
		colors[2]="Blue";
		colors[3]="Yellow";
		//colors[4]="Green";
		System.out.println("Size of array is "+colors.length);
		System.out.println(colors[0]);
		
		byte[]smallArray=new byte[89997];
		//create an array char and store grades into it:A,B,C,D,E,F.
		//Then print a grade B
		char[]grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[0]);
		
		
		
		
		
		
		
	}

}
