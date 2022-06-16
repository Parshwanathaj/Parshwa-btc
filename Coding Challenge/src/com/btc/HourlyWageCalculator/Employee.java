package com.btc.HourlyWageCalculator;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			WageCalcu employee = new WageCalcu();
			
			System.out.print("Enter name of the employee : ");
			String name = input.nextLine();
			employee.setEmployeeName(name);

			System.out.print("Enter base pay of the employee : ");
			int hours = input.nextInt();

			System.out.print("Enter number of hours worked by the employee : ");
			double rate = input.nextInt();

			employee.calculatePay(hours, rate);
			employee.displayEmployee();
		}
		System.out.println();
	}
}