package com.btc.HourlyWageCalculator;

import java.util.Scanner;

public class HourlyWageCalculator
{
	public static void main(String[] args) 
	{
		final int baseSal = 12;
		int hours = 40;
		double totalsal = 0;

		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter name of the employee");
			String name = sc.next();
			System.out.println("Enter base pay of the employee");
			double basePay = sc.nextDouble();
			System.out.println("Enter number of hours worked by the employee");

			int noOfHours = sc.nextInt();
			if (basePay >= baseSal)
			{
				if (noOfHours >= hours) 
				{
					int extrahours = noOfHours - hours;
					totalsal = hours * basePay + extrahours * 24;
				}
			} 
			else
				totalsal = 0;

			System.out.println("Name ::" + name);
			System.out.println("Base pay ::" + basePay + "$");
			System.out.println("Hours worked ::" + noOfHours);
		}
		System.out.println("Salary of employee ::" + totalsal + "$");
	}
}