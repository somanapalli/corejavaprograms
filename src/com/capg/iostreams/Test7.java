//program on serialization - write operation 
package com.capg.iostreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test7 {

	
	public static void main(String[] args) throws Exception{
		
		
		//create the object for FileOutputStream
		
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		//create the object for ObjectOutputStream
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student st = new Student();
		st.setStid(100);
		st.setStname("Rama");
		
		oos.writeObject(st);
		
		System.out.println("serialization process done");
		
	}
}
