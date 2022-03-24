package com.capg.iostreams;

import java.io.FileReader;

public class Test5 {
	public static void main(String[] args) throws Exception {
		
		//create the object for FileReader
		
		FileReader fr = new FileReader("abc.txt");
		
		int x = fr.read();
		
		while(x!=-1)
		{
		    //type casting from integer type to character type
			System.out.print((char)x);
			x=fr.read();
		}
	}

}
