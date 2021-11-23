package com.syntax.class15;

public class Dog {
			// Instance Variable
	String name;// Instance Variable, no need to initialize
	String color;// Instance Variable
	static int noOfLegs=4;
	
	void sleep() {
		int times=3;   //local variable in the block of code{}, need to initialize, no access outside of loop
		System.out.println(times);
		System.out.println(name+" is sleeping");
	}
void eat() {
	System.out.println(name+ " can eat");
}

	}


