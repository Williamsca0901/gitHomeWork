package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array char and store grades into it:A,B,C,D,E,F.
		// Then print a grade B

		// 1. one way to create array
		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);

		int num;// declare an array
		num = 10;// initialize it's size

		char[] gender;// declare an array
		gender = new char[2];// initialize it's size

		// 2. shorter way to create array
		char[] gradesArray = { 'A', 'B', 'C', 'D' };
		System.out.println(gradesArray.length);// 4
		System.out.println("Element with index 2 is " + gradesArray[2]);// 4
		
		
		//elements inside array always stored based on index(index starts from 0)
		String[] names = { "Resa", "Kevin", "Ashley", "Cindy" };
		names [0]="Philip";//replacing element with index 0
		System.out.println("After change is "+names[0]);
		//names[4]="Colin";
		//System.out.println(names[4]);//java.lang.ArrayIndexOutOfBoundsException
		
		String[] cars= {};
		System.out.println(cars.length);
		String []carrs=new String[3];
		
		/*int []nums;	cannot declare array separately if we want to store values in a shorter way
		*num= {10,11,12}; // compiler will complain on this line
		*/
		
		int[]nums= {10,12,56};
		
		String[] words= {" Jave ", " Saturday ", " day. ", " coding "," is "};
		
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);

		for(int i=0; i<words.length;i++);
		
	}

}			




				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
	
