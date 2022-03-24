package com.capg.iostreams;

import java.io.PrintWriter;

public class Test4 {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("abc.txt");
		
		pw.println("abc");
		pw.println("xyz");
		pw.println(100);
		pw.println(true);
		
		pw.close();
		System.out.println("write operation done");
		
		
		
	}

}
