package com.syntas.class13;

public class Task3 {
     //Create a method that will say Hello in different language based on the
	//country that will passed when method is executed.
	
	void printHello(String country) {
		switch( country) {
		case "USA":
		System.out.println("Hello");
		break;	
		case"Germany":
			System.out.println("Hallo");
			break;
		case "Afg":
		System.out.println("Salam");
		break;
		case "Turkey":
			System.out.println("Merhaba");
			
		}
	}
}
