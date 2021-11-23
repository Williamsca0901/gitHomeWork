package com.syntax.class17;

public class Book {
		//Write Book class that will have instance variables and 2 Constructors. 
		//While creating an object make sure:
		//Instance variables are being initialized
		//Both Constructors are being executed
      String cover;
      String type;

	public Book() {

	}

	public Book(String cover) {
		this();
		this.cover = cover;
	}

	public Book(String cover, String type) {
		this(cover);
		this.type = type;
	}

	void printAllInfo() {
		System.out.println(" cover: " + cover + " type: " + type);

	}

}
