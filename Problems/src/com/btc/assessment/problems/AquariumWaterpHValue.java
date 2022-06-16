package com.btc.assessment.problems;

import java.util.Scanner;

public class AquariumWaterpHValue
{
	public static void main(String []arg)
	{
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter the ph value");
		int ph=sc.nextInt();
		if(ph<7)
			System.out.println("pH value is low, partial water change required");
		else if(ph==7 | ph==8)
			System.out.println("pH value is fine");
		else
			System.out.println("pH value is high, partial water change required");
	}
	}
}