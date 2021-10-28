package com.syntax.class06;

public class WhileLoopDemo {

	public static void main(String[] args) {
		System.out.println("I want to print EVEN numbers from 1 to 10");
		int i=2;
		while (i<=10) {
			System.out.println(i);
			i+=2;
			System.out.println("I am outside of the while loop");
			System.out.println(i);
			System.out.println("______ANOTHER WAY _______");
			
			int a = 1;
			while (a <= 10) {
				if (a % 2 == 0) {
					System.out.println(a);
					
				}
				a++;
			}
			
			
		}

	}

}
