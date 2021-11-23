package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="ajdh1fl0dfMNOPKLTn1dfndg123456789667lz@#$%^&*";
		System.out.println(str.replaceAll("[0-5]", "*"));// can specify range 0-5 will be replaced with *
		System.out.println(str.replaceAll("[a-z]", "*"));// use[] for split and char
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "&"));
		System.out.println(str.replaceAll("[A-Z]", "&").replaceAll("[a-z]", "&"));
	System.out.println(str.replaceAll("[^a-zA-Z0-9]", "%")); // works like OR
	System.out.println(str.replaceAll("[&#@]", "*"));// will not include chars specified
	System.out.println(str.replaceAll(" ", " "));
	}

}
