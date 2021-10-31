package com.systax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// nested loop -- loops inside another loop
		for (int i=1; i<=9; i++) {//outer loop
		
			
			for (int j=0; j<=9; j++){//inner loop ; code continues until it is false then goes back to outer loop
				//the inner loop will reset and continue until false and goes back to outer loop, code will stop when outer
				//loop becomes false. outer loop will tell times inner loop will execute, outer loop controls inner loo
				System.out.println(i+""+j);
		}

	}
	System.out.println("---------Car Odometer ---------");
	for (int a=0; a<=9; a++) {
	for (int b=0; b<=9; b++) {
		for (int c=0; c<=9; c++) {
			for  (int d=0; d <=9; d++){
				System.out.println(a+""+b+""+c+""+d);
			}
		}
	}
	}	
		System.out.println("------Multiplication table-------");
		for (int i=1;i<=10; i++) {
			for (int j=1 ; j<=10 ; j++) {
				System.out.println(i+""+j+"="+i*j);
				
			}
			System.out.println("*****************");
		}
		
		
		
		
		
		
		
		
		
	}
}