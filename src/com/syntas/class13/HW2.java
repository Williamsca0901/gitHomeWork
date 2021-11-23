package com.syntas.class13;

public class HW2 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String.
		
		String str="hello";//hello/2=2.5 will take 2 since integer and ans will be "L"
		
	
			if(!str.isEmpty()&&str.length()%2!=0&&str.length()>=3) {
				System.out.println(str.charAt(str.length()/2));
			
			}
		}
	}
	
	


