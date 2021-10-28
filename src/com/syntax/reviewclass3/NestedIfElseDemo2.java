package com.syntax.reviewclass3;

public class NestedIfElseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10;
		boolean isTrue=true;
		double number2=30;
		
		if(number>5) {
			if(isTrue) {
				if (number2==30) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
			}else {
				System.out.println("3");
			}
			if (number2>10) {
				System.out.println("5");
			}
		}else {
			if (number2==20) {
			System.out.println("4");
			
				
				}
			}
	}
}

		


