package com.syntax.class11;

public class HumanTester {

	public static void main(String[] args) {
		Human tamana=new Human();
		tamana.name="Tamana";
		tamana.age=16;
		tamana.height=5.8;
		tamana.weight=30;
		tamana.gender='F';
		tamana.bloodType="A+";
		
		tamana.eat();
		tamana.sleep();
		tamana.walk();
		tamana.sendMemes();// won't print since it is for Sebastian
		
		System.out.println("***************************");
		
		Human sebastian=new Human();
		sebastian.name="Sebastian";
		sebastian.age=18;
		sebastian.height=6.2;
		sebastian.weight=100;
		sebastian.gender='M';
		sebastian.bloodType="A-";
		sebastian.eat();
		sebastian.walk();
		sebastian.sendMemes();
		System.out.println(sebastian.age);

	}

}
