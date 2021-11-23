package com.systax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			if(i==3) {
				continue;//skips current cycle will skip 3 code and continue to 5
				
			}
			System.out.println("Hi "+i);
			System.out.println("Hello "+i);
			
			
		}
		System.out.println("************* ");
		//I want to print number form 1-10 numbers except 3,7,9
		for (int i=1; i<=10; i++) {
			if (i==3|| i==7|| i==9) {
				continue;
			}
			System.out.println(i+"");
		}
	
		System.out.println();
System.out.println("End of the code");
	}
}

