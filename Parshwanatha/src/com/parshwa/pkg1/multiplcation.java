package com.parshwa.pkg1;
import java.util.Scanner;

public class multiplcation 
{
	public static void main(String [] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur number");
		int t=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"x"+i+"="+t*i);
		}
	}
}