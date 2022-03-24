package com.capg.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	
	public static void main(String[] args) {
		//ctrl+shift+o- to import the packages
		
		try {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int x = s.nextInt();
	
		System.out.println("enter the second number");
		int y = s.nextInt();
		
		
		int z= x/y;
		System.out.println("division is : " + z);
		}
		
		
		catch(InputMismatchException im)
		{
			System.out.println("please enter only numeric values");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero as a denominator");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("iam from finally block gets executed always");
		}
		System.out.println("rest of the code is executed");
		
	}
}
