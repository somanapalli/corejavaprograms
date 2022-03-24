package com.wipro.jse;

import com.capg.accessmodifiers.Test1;

//other package independent class
public class Test3{

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		
		System.out.println("public property value is : " + obj.a);
		
	}
}
