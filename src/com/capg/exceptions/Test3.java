package com.capg.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public void checkProductWeight(int weight) {
		
		if (weight > 100) {
			System.out.println("product is valid");
		} else {
			try {
				throw new InvalidProductException();
			} catch (InvalidProductException ie) {
				System.out.println("product weight must be greater than 100kgs");
			} 
		}
	}

	
	public static void main(String[] args) {

		Test3 obj = new Test3();
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the product weight");
		int weight = s.nextInt();
		obj.checkProductWeight(weight);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("weight must be in numerics");
		}
	}

}
