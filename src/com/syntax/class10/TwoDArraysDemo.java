package com.syntax.class10;

public class TwoDArraysDemo {

	public static void main(String[] args) {
	int[][] bigArray=new int [3][3];
// adding element inside 1 array or 1 row
	bigArray [0][0]=10;
	bigArray [0][1]=20;
	bigArray [0][2]=20;
	//adding element inside 2array or 2 row
	bigArray [1][0]=1;
	bigArray [1][1]=2;
	bigArray [1][2]=2;
	//adding element inside 3 array or 3 row
	bigArray [2][0]=100;
	bigArray [2][1]=200;
	bigArray [2][2]=200;
	//how to access?
	// access 200
	System.out.println(bigArray[2][1]);//200
	//what it shows?
	System.out.println("2D array size " +bigArray.length);// returns how many 1d arrays it has or # of rows
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
