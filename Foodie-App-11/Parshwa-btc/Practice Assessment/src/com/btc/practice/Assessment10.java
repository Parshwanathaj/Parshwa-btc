package com.btc.practice;

public class Assessment10 {
	static int equalsEquals(int a1[], int a2[]) {
		int temp = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a1[i]);
					temp = temp + a1[i];
				}
			}
		}
		return temp;
	}
public static void main(String args[]) {
		int a1[] = { 1, 2, 3, 4 };
		int a2[] = { 7, 3, 4, 5 };
		System.out.println(equalsEquals(a1, a2));

	}
}