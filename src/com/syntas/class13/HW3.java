package com.syntas.class13;

public class HW3 {

	public static void main(String[] args) {
		// Create a String and print it in the reverse order (Sunday).
		
		String str="Sunday";//6 index,Yis at index 5 = use i-- to get last index
		
		String newStr="";
		
		
		for (int i=str.length()-1; i>=0; i--) {
			newStr=newStr+str.charAt(i);//new str=newstr+char
			
		}
		System.out.println(newStr);

	}

}
