package com.syntas.class13;

public class StringDemo {

	public static void main(String[] args) {

		String name = new String("Christine");
		String name1 = "Christine";
		name.length();
		System.out.println(name.length());
		System.out.println(name1.length());
		
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		String str="This is easy 123456 ^%$&";
		System.out.println(str.toLowerCase());
		
		System.out.println(name.concat(name1));//not recommend to use
		int number=10;
		System.out.println(name+name+number);
		//System.out.println(name.concat(name1).concat(number);)cannot combine different variables
	}

}
