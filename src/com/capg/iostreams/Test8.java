package com.capg.iostreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//program on deserialization
public class Test8 {
	
	public static void main(String[] args) throws Exception{
		
		//create the object for ObjectInputStream 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xyz.txt"));
				
		Student stu = (Student)ois.readObject();
		
		System.out.println("student id is: " + stu.getStid());
		System.out.println("student name is : " + stu.getStname());
		
	}

}
