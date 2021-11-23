package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		//Retrieving 1 element from 2D Array
		 //Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama. After storing values print the following 
		 // String : Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

String [][]names= {
		{" Mr ", " Mrs ", " Ms ", " Miss "},//0
		{" Smith ", " Jordan ", " Jackson", " Obama "},//1
};
		System.out.print(names[0][1]+""+names[1][0]+","+names[0][0]+""+names[1][3]+","+names[0][2]+""+names[1][2]+","+names[0][3]+""+names[1][1]);	
		
	}
	}

	
	
	

