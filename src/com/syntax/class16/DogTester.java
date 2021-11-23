package com.syntax.class16;

public class DogTester {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "Casper";
		dog1.displayName();

		Dog dog2 = new Dog();
		dog2.name = "Babli";
		dog2.displayName();

		Dog dog3 = new Dog();
		dog3.name = "Odin";
		dog3.displayName();

		Dog.DisplayLegs();

	}
}
