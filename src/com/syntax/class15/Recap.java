package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Lubo.Lubo is break manager";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo", "Sorbon"));

		String str2 = "kajdsojvmaed123456789*%$#@";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));// replace all char
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));// not able to replace unless specified

		System.out.println("********************************");

		String str3 = "";
//string is not recommended because every time it will search the memory and that will slow down the code
		for (int i = 0; i < 5; i++) {
			str3 = str3 + i;

		}
		System.out.println(str3);
	

//When you have to change the value of a string variable always use StringBuilder class
	StringBuilder stringBuilder=new StringBuilder();// append means con-cat
	for (int i =0;i<5;i++){

		stringBuilder.append(i);
	System.out.println(stringBuilder);
	}
	
	String str4="Me: Look it's not you it's me, walking away";
	StringBuilder strBuilder=new StringBuilder(str4);
	strBuilder.reverse();
	System.out.println(strBuilder);
	
	
	
	
	
	
	
}
}
