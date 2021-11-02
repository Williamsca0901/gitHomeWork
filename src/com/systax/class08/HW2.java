package com.systax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Ask user what he/she wants to buy, ask for price and to pay for an item.
		 * continue asking to pay until use gets a right amount.conditions: if user
		 */
		Scanner input = new Scanner(System.in);
		String item;
		double price;
		double money;
		double remainder;
		double sum = 0;
		System.out.println("Please enter the item you want to purchase");
		item = input.next();
		System.out.println("Please enter the price");
		price = input.nextDouble();
		do {
			System.out.println("Please pay for the " + item);
			money = input.nextDouble();
			sum += money;
			if (sum > price) {
				double change = sum - price;
				System.out.println("Here is your change");
				break;
			} else if (sum < price) {
				remainder = price - sum;
				System.out.println("Please give me more" + remainder);
			} else {
				System.out.println("You got the right amount");
			}
		} while (sum != price);
		System.out.println("Thank you for shopping");

	}
}
