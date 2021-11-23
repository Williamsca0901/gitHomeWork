package com.syntas.class13;

import java.util.Arrays;

public class MethodDemoTester {

	public static void main(String[] args) {
		
		MethodsDemo obj=new MethodsDemo();
		//obj.add(10, 10);
		System.out.println(obj.add(10,10));
		
		int [] array= {10, 10, 10};
		array=obj.doubleArray(array);
		System.out.println(Arrays.toString(array));

	}

}
