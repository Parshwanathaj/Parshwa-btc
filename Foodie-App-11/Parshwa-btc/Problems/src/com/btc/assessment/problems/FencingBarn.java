package com.btc.assessment.problems;

import java.util.Scanner;

public class FencingBarn {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter side of square : ");
			int s = sc.nextInt();
			int area = 0;
			area = s * s;
			System.out.println("Area of square fence for chickens is " + area);
		}

	}
}