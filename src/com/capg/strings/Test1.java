package com.capg.strings;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		String s1 = "rama";
		String s2 = "rama";
		System.out.println(s1==s2);//true
		
		String s3 = new String("krishna");
		String s4 = new String("krishna");
		
		System.out.println(s3==s4);//false
		
	}

}
