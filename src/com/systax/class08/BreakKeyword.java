package com.systax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		for (int i=0; i<=4; i++) {
			System.out.println("Almost done");
			break;
		}
		for (int i=0;i<=10; i++) {
			System.out.println("Almost done");
			if (i==3){
				System.out.println("About to break the loop");
			}
			}
		System.out.println("*******************************");
		boolean summer=true;
		int temp=75;
		while(summer) {
			System.out.println("I am happy, I love summer");
			temp+=75;

	if (temp>=100) {
		
		System.out.println("I don't love summer anymore");
		break;
	}
	temp+=5;
}
	}

	}


