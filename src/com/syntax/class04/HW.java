package com.syntax.class04;
import java.util.Scanner;
public class HW {
	public static void main(String[] args) {

		/*
		Given the following inputs:
		int x;
		Write a for loop that will print out a series of numbers starting at 0 and ending 
		at the x(value must be taken from a user), exclusive.
		Example Output:
		In: 3
		0 1 2
		In: 8
		0 1 2 3 4 5 6 7
		In: 5
		0 1 2 3 4
		 */
		
	        Scanner inp=new Scanner(System.in);
		        System.out.print("In:");
		        int x=inp.nextInt();
		        //write code under on step 8
		        for (int i = 0; i < x; i++) {
		            System.out.print(i+" ");
		        }
		        
		    }
		
	}
		


