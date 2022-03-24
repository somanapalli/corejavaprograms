package com.capg.java8;

import java.util.ArrayList;
import java.util.Collections;

import javax.security.auth.x500.X500Principal;

public class Test8 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(102,"nageswari"));
		
		al.add(new Employee(101,"capg"));
		al.add(new Employee(104,"vamshi"));
		al.add(new Employee(103,"divya"));
		
		al.add(new Employee(100,"rama"));
		System.out.println("before soring : " + al);
		
		Collections.sort(al,  
				
				(a,b)->(a.getEmpid()<b.getEmpid())?-1:
					   (a.getEmpid()>b.getEmpid())?1:0);
		
		
		System.out.println("after sorting: " + al);
		
		
		
	}

}
