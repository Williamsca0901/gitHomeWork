package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// length method and other methods
		String name = "     Nasiri               ";
		System.out.println(name.length());
		System.out.println(name.startsWith("a"));// boolean var for this method starts with
		System.out.println(name.endsWith("r")); // strings are case sensitive
		System.out.println(name.contains("a")); // true/false answer
		System.out.println(name.equals("Nasir")); // case sensitive can use .equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase("NASIR"));
		System.out.println(name.charAt(4)); // char at specific index// string index out of bound
		System.out.println(name.indexOf("i"));// -1 if char is not included-gives the first value of "i"
		System.out.println(name.indexOf("i", 4));// second occurrence of index "i"

		System.out.println(name.substring(1));
		System.out.println(name.substring(2, 4));// substring gives char from the index and what else is after
		System.out.println(name.isEmpty());// check if string name= is empty will return false
		System.out.println(name.trim()); // trims spaces in the string ******Nasiri******
		String sentence = "this is a Java class"; // split sentence base on spaces will split in
		//the next index of the array
		System.out.println(sentence.split(" ").length);// add space between "--"
		System.out.println(sentence.split(" ")[3]);

	}
}