package com.syntax.class09;

public class HWArray2 {

	public static void main(String[] args) {
		String [] animals= {"dog", "cat","bird", "pig", "frog", "rabbit"};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]+"");
		}
		System.out.println("******************");
		
		for (String a:animals) {
		System.out.println(a);
	}
	}
}

