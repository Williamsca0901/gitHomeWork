package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		 int secretNumber=78;
	      Scanner scan=new Scanner(System.in);
	      int userNumber;
System.out.println("Please guess my secret number. It is a number from 1 to 100");
	      userNumber=scan.nextInt();
	      while(userNumber!=secretNumber) {
	    
 System.out.println("Please guess my secret number. It is a number from 1 to 100");
 userNumber=scan.nextInt();
	      }
	System.out.println("You got it !!");
	}
	

}
