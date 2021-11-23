package com.syntas.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " ";
		//System.out.println(name.isBlank());//looks for character only is Java16
		System.out.println(name.isEmpty());// has space not empty=no space is empty
		name = "Christine";
		System.out.println(name.isEmpty());

		String str = "    Batch11 is......     ";
		System.out.println(str.trim());// removes leading and trailing spaces

		String str2="This is a easy class";
		System.out.println(str2.toLowerCase().startsWith("t"));//method chaining
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.endsWith("s"));	
	
	}
}
