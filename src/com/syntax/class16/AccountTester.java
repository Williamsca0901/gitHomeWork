package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
	
		Account account1=new Account();
		//account1.balance=123454554 not allowed because private
		account1.setUserName("Asghar");
		account1.setPassword("pass123");
		account1.getBalance("Asghar", "pass123");

	}

}
