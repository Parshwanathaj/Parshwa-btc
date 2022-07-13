package com.parshwa.pkg1;

public class GreatestThree 
{
	public static void main(String [] arg)
	{
		int a=100,b=300,c=200;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
