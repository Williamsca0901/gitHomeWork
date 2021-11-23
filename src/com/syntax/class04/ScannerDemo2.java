package com.syntax.class04;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an item you want to buy");
		
		String item=input.next();//String till space (1 word)
		
		System.out.println("Please enter the price of the "+item);
		double price=input.nextDouble();//1 double value
		
		System.out.println("you selected"+item+ "with price="+price);

	}

}
