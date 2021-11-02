package com.syntax.class09;

public class HWArray1 {

	public static void main(String[] args) {
		String [] cars= {"honda", "toyota","dodge", "tesla", "ford", "bmw"};
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+"");
		}
		System.out.println("******************");
		
		for (String c:cars) {
		System.out.println(c);

	}

}
}