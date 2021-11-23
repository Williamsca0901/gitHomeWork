package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// Creating an object of Dog class
		Dog alonasDog = new Dog();
		alonasDog.name = "Lexy";
		alonasDog.breed = "american hound";
		alonasDog.color = "Black";
		alonasDog.height = 2.5;
		alonasDog.age = 10;
		alonasDog.gender = 'M';

		System.out.println("My Dog Name is " + alonasDog.name);
		System.out.println("His breed is " + alonasDog.breed);
		System.out.println("His color is " + alonasDog.color);
	
		

	Dog jimmysDog = new Dog();
	jimmysDog.name = "Teddy";
	jimmysDog.breed = "Labrador Retriever";
	jimmysDog.color = "Golden";
	jimmysDog.height = 5;
	jimmysDog.age = 5;
	jimmysDog.gender = 'M';
	
	System.out.println("My Dog Name is " + jimmysDog.name);
	System.out.println("His breed is " + jimmysDog.breed);
	System.out.println("His color is " + jimmysDog.color);
	
	Dog arawasDog = new Dog();
	arawasDog.name = "Manroe";
	
	
	System.out.println("Arwas Dog is " + arawasDog.name);
	

	}

}
