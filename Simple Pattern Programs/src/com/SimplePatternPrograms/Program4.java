package com.SimplePatternPrograms;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner Pt = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");

		int rows = Pt.nextInt();
		for (int i = 0; i <= rows - 1; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= rows - 1 - i; k++) 
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		Pt.close();
	}
}