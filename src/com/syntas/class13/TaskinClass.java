package com.syntas.class13;

public class TaskinClass {

	public static void main(String[] args) {
		
		System.out.println("Your username and password has been created");
		String userName = "Henok";
		String password = "Pass1235";
		String confirmPass="Pass1234";

		if(!(userName.isEmpty()|| password.isEmpty())) {
			if (password.length()>=8) {
				if(password.contains(userName)) {
					if(password.equals(confirmPass)) {
						
						System.out.println("Your username and password has been created");
			}else {
				System.out.println("Password do no match");
			}
				}else {
				System.out.println("Password cannot contain username.");
			}
				
			}else {
				System.out.println("Password is too short");
		}	
			
		}else {
			
		System.out.println("Username and Password cannot be empty");
			

			
			}		
			}
		}

	


