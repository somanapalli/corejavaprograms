package com.capg.cfw;

import java.util.HashSet;

public class Test7 {
	
	public static void main(String[] args) {
		
		
		HashSet<Student> hs = new HashSet<Student>();
		
		Student st1 = new Student();
		st1.setStid(100);
		st1.setStname("sahana");
		
		Student st2 = new Student();
		st2.setStid(101);
		st2.setStname("gopal");
		
		Student st3 = new Student();
		st3.setStid(102);
		st3.setStname("ganesh");
		
		
		hs.add(st1);
		hs.add(st2);
		hs.add(st3);
		
		
		
		
		System.out.println(hs);//[100 sahana, 101 gopal]

		
		//for each loop
		for(Student st: hs)
		{
			if(st.getStname().startsWith("s"))
			{
				System.out.println(st.getStname());
			}
		}
		
	}

}
