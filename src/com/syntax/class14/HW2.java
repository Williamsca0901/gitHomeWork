package com.syntax.class14;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str3="This is sentence I want to reverse";
		String []strArr=str3.split(" ");
		for (String word:strArr) {
			StringBuilder stringBuilder=new StringBuilder(word);
			System.out.print(stringBuilder.reverse()+"");
			
	}
	}
}
