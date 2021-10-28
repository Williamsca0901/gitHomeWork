package com.syntax.reviewclass3;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month=6;
		String monthName=null;
		
		if (month==1) {
			System.out.println("Jan");
		monthName="Jan";
			System.out.println("Feb");		
			monthName="Feb";
		System.out.println("Mar");
		monthName="Mar";
			System.out.println("Apr");
			monthName="Apr";
			System.out.println("May");
			monthName="May";	
			System.out.println("Jun");
			monthName="Jun";
		}
		switch(month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		
		}
	}

}
