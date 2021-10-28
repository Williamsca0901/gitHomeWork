package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter any sentence");
		
		String entireLine = in.nextLine();//for more than 1 word to capture
		System.out.println(entireLine);
		

	}

}
