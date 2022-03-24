package com.capg.strings;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		String s1 = "rama";
		String s2 = "capgemini";
		
		String s3 = "           rama";
		
		System.out.println("lenght of the string is : " + s1.length() );
		
		System.out.println("first index letter is : " + s1.charAt(0));
		
		System.out.println("cocatinated string is:" + s1.concat(s2));
	
		System.out.println("uppercase string is : " + s1.toUpperCase());
	
		System.out.println("sub string is : " + s2.substring(0,4));
		
		System.out.println("replaced string is : " + s1.replace('r','p'));
	
	    System.out.println("trimmed string is : " + s3.trim());
	}

}
