package com.syntax.class06;
import java.util.Scanner;
public class classWork2 {

	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		System.out.println("Please enter your grade");	
		char grade= inp.next().charAt(0);
		String explanation;
		switch  (grade) {
		case 'A':
			explanation = "Excellent";
		break;
		case 'B':
			explanation = "Good";
		break;
		case 'C':
			explanation = "Average";
		break;
		case 'D':
				explanation = "Bad";
		break;
		default:
			explanation = "not acceptable";
			break;
		}
		if (!explanation.equals("not acceptable")) {
System.out.println(grade + " grade means " + explanation);
		} else {	
		}System.out.println("You entered invalid info");
			
		

	}

}
