package com.capg.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestPalindromeCheck {

	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","madam","malayalam","liril"})
	public void testIsPalindrome(String str)
	{
		PalindromeCheck obj = new PalindromeCheck();
		boolean actual = obj.isPalindrome(str);
		assertTrue(actual);
	}

}
