package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * rules:
		 * values in case MUST be same datatype as VARIABLE in switch
		 * We cannot have Duplicate Cases
		 */		
		 char gender='m';
		String description;
		switch(gender) {
		case 'm':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
			default:
				description="Unknown";
		}
		System.out.println(gender + " means "+description);
		/*
		 * limitation of operators
		 * we cannot use logical operators||&&
		 * we cannot use relational operators>=	
		 * limitations of data types
		 * cannot use boolean
		 * cannot be used with double/float
		 * cannot be used with long
		 * 
		 */
		
		}
			}


	


