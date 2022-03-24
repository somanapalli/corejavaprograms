package com.capg.iostreams;

import java.io.FileWriter;

public class Test2 {
	public static void main(String[] args) throws Exception{

		FileWriter fw = new FileWriter("abc.txt");
		
        fw.write("abc\n");
        fw.write("xyz\n");
        fw.write(100);//
        System.out.println("write operation gets completed");
        
        fw.close();
	}

}
