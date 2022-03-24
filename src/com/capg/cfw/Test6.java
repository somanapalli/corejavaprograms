package com.capg.cfw;

import java.util.ArrayList;

public class Test6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al  = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		//invalid: compile time error -> al.add("rama");
		
		for(Integer x : al)
		{
			if(x%2==0)
			System.out.println(x);
		}
		
	}

}
