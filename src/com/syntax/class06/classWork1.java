package com.syntax.class06;
import java.util.Scanner;
public class classWork1 {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("Please enter your country");	
		String country=Scan.next();
		String language=null;
		
		switch(country.toLowerCase()) {
		case "guyana":
			language = "english";
		break;
		case "cuba":
			language = "spanish";
		break;
		case "russia":
			language = "russian";
		break;
		default:
		language=("Invalid");
		}
		if (!language.equals("Invalid")){
System.out.println("Your country is "+country+ " and your language is "+ language );
	
	} else {	
		
System.out.println("Please try another country!");
		}
				
	}

	}


