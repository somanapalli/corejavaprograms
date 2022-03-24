package com.capg.cfw;

import java.util.ArrayList;

public class Test1 {
	
	public static void main(String[] args) {
		
		//create the object for ArrayList
		
		ArrayList al  = new ArrayList();
		
		System.out.println(al);//[]
		al.add(new Integer(100));
		al.add(new Float(3.4f));
		al.add(new String("rama"));
		al.add(new Boolean(true));
		al.add(new Integer(100));
		al.add(null);
		System.out.println(al);//[100,3.4,rama,true,100,null]
		
		
		
	}

}
