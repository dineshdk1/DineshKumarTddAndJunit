package com.test.tddandjunit.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removefirst2chars {
	
	
	/*
	 * 1: testcase : “ABCD” => “BCD”
	 * 2: testcase : “AACD” => “CD”
	 * 3: testcase : “BACD” => “BCD” 
	 * 4: testcase : “BBAA” => “BBAA” 
	 * 5: testcase :  “AABAA” => “BAA” 
	 * 
	 */
	removeFirst2Char removefirst2char;
	
	@BeforeEach
	void setup()
	{
		removefirst2char = new removeFirst2Char(); 
	}
	

	@Test
	void testcase1() 
	{
		assertEquals("BCD",removefirst2char.remove("ABCD"));
	}
	
	@Test
	void testcase2() 
	{
		assertEquals("CD",removefirst2char.remove("AACD"));
	}
	
	@Test
	void testcase3() 
	{
		assertEquals("BCD",removefirst2char.remove("BACD"));
	}
	
	@Test
	void testcase4() 
	{
		assertEquals("BBAA",removefirst2char.remove("BBAA"));
	}
	
	@Test
	void testcase5() 
	{
		assertEquals("BAA",removefirst2char.remove("AABAA"));
	}

}
