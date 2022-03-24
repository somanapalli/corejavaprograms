package com.capg.cfw;

import java.util.ArrayList;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		
		System.out.println("size is : " + al.size());
		
		System.out.println("first index value is : " + al.get(0));
		
		System.out.println("is this empty: " + al.isEmpty());
	
	    System.out.println(al.remove(0));//1
	    
	    System.out.println(al);//[2,3,4,5,6,7,8,9,10]
	    
	    System.out.println(al.remove(new Integer(2)));//true
	    
	    System.out.println(al);//[3,4,5,6,7,8,9,10]
	    
	    System.out.println(al.remove(new Integer(20)));//false
	    
	   // System.out.println(al.remove(10));//IndexOutOfBoundsException
	    
	    
	    al.clear();
	    
	    System.out.println(al);//[]
	}

}
