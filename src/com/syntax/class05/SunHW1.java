package com.syntax.class05;
import java.util.Scanner;
public class SunHW1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birth month.");
		
		String birth = input.nextLine();
		String season = null;
		
		if (birth.equals("december")||birth.equals("january")||birth.equals("february")) {				
		season="winter";
		//System.out.println("Your were born in winter");
		}
 else if (birth.equals("march")||birth.equals("april")||birth.equals("may")) {				
 		season="spring";
		//System.out.println("Your were born in spring");
 		}
else if (birth.equals("june")||birth.equals("july")||birth.equals("august")) {			
		season="summer";
		//System.out.println("Your were born in summer");
		}
else if (birth.equals("september")||birth.equals("october")||birth.equals("november")){		
		season="autumn";
		//System.out.println("Your were born in autumn");
}
		System.out.println("You were born in season "+ season);
		
		
	}

	}

