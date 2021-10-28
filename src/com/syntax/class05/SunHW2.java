package com.syntax.class05;
import java.util.Scanner;
public class SunHW2 {

	public static void main(String[] args) {
	 // Write a program that will read three inputs of scores
	 // (quiz, mid term and final score)
	 // and determine the grade based on the following rules:
	 // if the average score >= 90 grade = A
	 // if the average score >=70 and <90 grade = B
	 // if the average score >=50 and <70 grade = C
	 // if the average score is >50 grade = F
	 //
		Scanner input  = new Scanner(System.in);
		System.out.println("Please enter your quiz score.");
		int quizScore = input.nextInt();
		System.out.println("Please enter your mid term score.");
		int midtermScore = input.nextInt();
		System.out.println("Please enter your final score.");
		int finalScore = input.nextInt();
		
		int averageScore=(quizScore+midtermScore+finalScore)/3;
		String grade;
		
		if (averageScore>=90) {
			grade ="A";
			
		}else if (averageScore>=70 && averageScore<90) {
			grade ="B";
		}else if (averageScore>=50 && averageScore<70) {
			grade ="C";
		}else if(averageScore>50) {
			grade = "F";
		}else{
			grade="need to do a retake";
		}	
	System.out.println("Your grade is "+ grade);
	
		}
	
		}
	


