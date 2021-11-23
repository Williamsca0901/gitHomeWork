package com.syntax.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		
		boolean replCompleted=true;
		int assignments=10;
		
		if (replCompleted) {
			System.out.println("Great job!");
			if (assignments>16) {
				System.out.println("You did and amazing work");
			}else if (assignments>10) {
				System.out.println("You did good, but you should do more");
			}else if (assignments >6) {
				System.out.println("You need to try more hw");
			}else {
			}System.out.println("Why?");
			
		
			
	}else {
			System.out.println("Please make sure you do your homework");
		}
		
		
		
	}
	}

