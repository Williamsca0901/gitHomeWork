package com.syntax.class17;

public class Dog {
	String name;
	String color;
	String breed;
	int age;
	double weight;
	
	public Dog(String dogName,String dogColor, String dogBreed, int dogAge, double dogWeight) {
	
		System.out.println("Dogs constructor is called");// this is the constructor
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		System.out.println(dogName);
		printAge();
	}
	public void printName() {
		System.out.println(name);
	}
	public void printBreed() {
		System.out.println(breed);
	}
	public void printAge() {
		System.out.println(age);
	}
}
