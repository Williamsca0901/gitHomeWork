package com.syntax.class12;

public class Method3Tester {

	public static void main(String[] args) {
		// create object from class calling Methods
		Methods3 method = new Methods3();
		
		int max = method.getMax(100, 15);
		System.out.println(max);
	}

}
