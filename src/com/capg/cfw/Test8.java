package com.capg.cfw;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test8 {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		
		hm.put(2, "sahana");
		hm.put(100, "rama");
		hm.put(101, "divya");
		hm.put(102, "vamshi");
		hm.put(70, "krishna");
		
		
		
		
		 Set<Entry<Integer, String>> entrySet = hm.entrySet();
		 
		 
		for(Entry<Integer, String> entry: entrySet) {
			
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			
			
		}
	  
	}

}
