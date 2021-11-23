package com.syntas.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));	
		System.out.println(name.contains("i"));
		
		String str2="Hello";
		String str3="helhyjhuylo";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.toUpperCase().charAt(0));
		System.out.println(str3.indexOf('l',str3.indexOf('l')+1));// start search after index3(O)
		
		System.out.print(name.substring(10));//ignore first 10 index/letters
		System.out.print(name.substring(5,11));//letters from index 5 and after 11, start-end
	}
}
