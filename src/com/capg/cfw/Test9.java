package com.capg.cfw;

import java.util.TreeMap;

public class Test9 {
	
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put(100, "Rama");
		tm.put(4, "kiran");
		tm.put(23, "pavan");
		tm.put(17,"abc");
		
		tm.put(17, "xyz");
		
		
		//invalid: tm.put("abc", 17);
		
		//tm.put(null, null);//invalid
		
		
		
		
		System.out.println(tm);
		
	}

}
