package com.btc.practice;

import java.util.StringTokenizer;

public class Assessment5
{
	public static void main(String[] args) 
	{
		String input1 = "Hello*world";
		System.out.println(characterCheck(input1));
	}
public static boolean characterCheck(String input1) 
{
		boolean b = false;
		StringTokenizer t = new StringTokenizer(input1, "*");
		String s1 = t.nextToken();
		String s2 = t.nextToken();
		String s3 = s1.substring(s1.length() - 1);
		String s4 = s2.substring(0, 1);
		if (s3.equalsIgnoreCase(s4))
			b = true;
		return b;
	}
}