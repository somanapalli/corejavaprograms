package com.capg.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test3 {
	
	public static void main(String[] args) throws Exception{
		
		
		Writer fw = new FileWriter("abc.txt");
		
		//create the object of BufferedWriter
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("abc");
		bw.newLine();
		bw.write("xyz");
		bw.newLine();
		bw.write(100);
		
		bw.close();
		System.out.println("write operation done successfully");
	}

}
