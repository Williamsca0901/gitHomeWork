package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="Today is Tuesday, Today we have Java class.";//split at "." get two index
String[] strArr=str.split("[.]");// prints after letter T, .split("Today")

for (String s:strArr) {
System.out.println(s);//console shows split with ,
	}

}
}