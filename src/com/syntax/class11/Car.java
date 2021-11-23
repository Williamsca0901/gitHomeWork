package com.syntax.class11;

public class Car {
	String make;
	String model;
	String color;
	int year;
	double milage;

	void moveForward() {
		System.out.println("Moving forward");

	}
	
	void applyBreaks() {
		System.out.println("Applying breaks");
	}

	public static void main(String[] args) {
		Car ayshasCar = new Car();
		ayshasCar.make = "Honda";
		ayshasCar.model = "Fit";
		ayshasCar.color = "Silver";

		System.out.println("Aysha's has a " + ayshasCar.make);
		System.out.println("Aysha's car model is " + ayshasCar.model);
		System.out.println("Aysha's car color is " + ayshasCar.color);
		ayshasCar.moveForward();
		ayshasCar.applyBreaks();
	}
}
