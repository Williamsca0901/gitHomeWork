package com.syntax.class04;
import java.util.Scanner;
public class HW2 {
	  public static void main(String[] args) {
	
		/*
		You should input:
		int end;
		Write a for loop that will print out a series of numbers starting at 0 and ending 
		at the doubled value of end(value must be taken from a user), exclusive.
		Each number should be on the same line, separated by a space.
		Example Output:
		Int: 5
		0 1 2 3 4 5 6 7 8 9
		Int: 8
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		In: -5
		(no output)
		 */
		
		        Scanner inp= new Scanner(System.in);
		        System.out.print("Int:");
		        int end= inp.nextInt();
		        //write your code below
		        for (int i = 0; i < end * 2; i++) {
		            System.out.print(i + " ");
		        }
		        /*
		        Given the following inputs:
		        int x;
		        Write a for loop that will print out a series of numbers starting at one less than 
		        x and ending at 0.
		        Sample input/outputs:
		        In: 7
		        6 5 4 3 2 1 0
		        In: 12
		        11 10 9 8 7 6 5 4 3 2 1 0
		        In: 20
		        19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		         */
		        System.out.println();
		  
	  
		                System.out.print("In:");
		                Scanner input = new Scanner(System.in);
		                int x = input.nextInt();
		                for (int i = x - 1; i >= 0; i--) {
		                    System.out.print(i+" ");
		                }
		            }
		    }
		

	

