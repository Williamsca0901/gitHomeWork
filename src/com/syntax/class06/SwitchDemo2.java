package com.syntax.class06;
import java.util.Scanner;
public class SwitchDemo2 {

	public static void main(String[] args) {
		/* we need to capture a country from a user
		 * based on the country we have to define a favorite food
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a country");
		String country= scan.next();
		String food;
		
		switch  (country.toLowerCase()) {
		case "guyana":
			food = "cookup";
		break;
		case "usa":
			food = "burger";
		break;
		case "italy":
			food = "pasta";
		break;
		default:
			food = "Unknown";
		}
		if (!food.equals("Unknown")) {
System.out.println("If your country is "+ country +(" your favorite food is ")+ food);
		} else {	
		}System.out.println("Please try another country");
			
		
	}

}
