package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone= new Phone();
		iphone.make= "Iphone";
		iphone.model= "Ipnone 13";
		iphone.RAM=6;
		iphone.ROM = 512;
		iphone.screen = 6.7;
		iphone.camera = 36;
		iphone.makePhoneCalls();
		iphone.takePictures();

		System.out.println("**********************");
		
		Phone googlePixel=new Phone ();
		
		googlePixel.make = "Google";
		googlePixel.model = "Google Pixel 6 pro";
		googlePixel.RAM = 6;
		googlePixel.ROM = 512;
		googlePixel.screen = 6.7;
		googlePixel.camera = 36;
		googlePixel.makePhoneCalls();
		googlePixel.takePictures();
	}

}
