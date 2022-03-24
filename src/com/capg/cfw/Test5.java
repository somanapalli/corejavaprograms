package com.capg.cfw;

import java.util.ArrayList;

public class Test5 {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		  
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		
	
		//dispalying collection elements one by one using for loop
		System.out.println("=============for loop =============");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//displaying collection elements one by one using for each loop 
		
		System.out.println("===========foreach loop===============");
		for(Object o : al)
		{
			//type casting (Object type to Integer)
			Integer x = (Integer)o;
			
			if(x%2==0)
			{
				System.out.println(x);
			}
		}
	
	}

}
