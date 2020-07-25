package com.test.tddandjunit.project;

public class removeFirst2Char 
{
	public String remove(String string)
	{
		String result=string;
		if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			result=string.substring(2,string.length());
		}
		else if(string.charAt(0)=='A')
		{
			result=string.substring(1,string.length());
		}
		else if(string.charAt(1)=='A')
		{
			result=string.charAt(0)+string.substring(2,string.length());
		}
		
			
		return result;
	}
	
	
}
