package com.syntax.class14;

public class HW1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.
		String str = "Today was Java class.";// use string if will not change original
		System.out.println(str.replace(" ", ""));
		str = str.replaceAll("\\s", "");
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str);// not change to original sentence immutable
		StringBuilder str2 = new StringBuilder("Today was Java class)");// use strbldr if need to change over and over
		System.out.println(str2.reverse());
		System.out.println(str2);

		System.out.println("*******************");

		// Create a String that should be combination of letters, numbers and special
		// characters.
		// Find out how many alpha characters are there in the String.
		String str1 = "aliefseimmdMNOUP0123645978**&&";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str1.replaceAll("[^a-zA-Z]", "").length());

		System.out.println("*******************");

		// You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class
		// today?”
		// How would you find out how many sentences are in that String?
		String a = "Is it Saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(a.split("[?.!] ").length);

		System.out.println("*******************");

		// How would you reverse a String character by character?
		String name = "Williams";
		String newName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			newName = newName + name.charAt(i);// new str=newstr+char
		}
		System.out.println(newName);

		// How would you check if String is palindrome or not?

		// How would you swap 2 strings without a temporary variable?

	}

}