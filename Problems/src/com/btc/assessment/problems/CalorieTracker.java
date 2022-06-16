package com.btc.assessment.problems;

import java.util.Scanner;

public class CalorieTracker {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Calorie burnt by cycling :");
			int cyc = s.nextInt();
			System.out.println("Calorie burnt by running :");
			int run = s.nextInt();
			System.out.println("Calorie burnt by swimming :");
			int swim = s.nextInt();
			System.out.println("Calorie intake in a day :");
			int intake = s.nextInt();
			float weightLost;
			int intakeMon = intake * 30;
			int weekCal = (cyc + run + swim) * 2;
			int monCalexe = weekCal * 4;
			int monCal = monCalexe - intakeMon;
			weightLost = monCal / 1000;
			System.out.println("Weight lost by you in a month is : " + weightLost + " pounds");
		}
	}
}