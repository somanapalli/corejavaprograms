package com.capg.strings;
//program on String immutability

public class Test4 {
	
	public static void main(String[] args) {
		
		
		String s1 = "capg";
		String s2 = "banglore";
		
		s1.concat(s2);
		
		System.out.println(s1);//capgbanglore
	}

}
