package com.capg.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestOperations {

	private static Operations obj;
	
	@BeforeAll
    public static void init()
    {
    	obj = new Operations();
    }
	
	
	@Test
	void testSum() {
	
		int actualresult = obj.sum(3, 4);
		
		int expectedResult = 7;
		
		assertEquals(expectedResult, actualresult);
		
	}
	
	
	@Test
	void testSub() {
	int actualresult = obj.sub(4, 3);
		
		int expectedResult = 1;
		
		assertEquals(expectedResult, actualresult);
	
	}
	
	@AfterAll
	public static void destroy()
	{
		obj = null;
	}
	
	
	
	

}
