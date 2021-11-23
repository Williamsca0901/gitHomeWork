package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Batch 11 Batch 11 is good";
		System.out.println(str.replace("good", "GREAT"));
		
		str = "This is Batch 11 is good Batch 11 is good";
		System.out.println(str.replace("good", "GREAT").replace("Batch","Not Batch"));
		System.out.println(str.replaceFirst("good","Great"));
	}

}
