package com.capg.exceptions;
//calling program
public class Test2 {

	 public static void main(String[] args) 
	 {
	 
		 Test1 obj = new Test1();
		 
		 try
		 {
			 obj.division(100, 0);
		 }
		 catch(ArithmeticException ae)
		 {
			 System.out.println("don't enter zero as denominator");
		 }
		 
		 System.out.println("Rest of the code also gets executed");
		
	}
}
