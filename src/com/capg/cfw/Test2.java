package com.capg.cfw;

import java.util.HashSet;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		
		HashSet hs = new HashSet();
		
		hs.add(new Integer(100));
		hs.add(new Float(3.4f));
		hs.add(new String("rama"));
		hs.add(new Integer(100));
		hs.add(null);
		
		System.out.println(hs);//[null, 3.4, 100, rama]
		
		
	}

}
