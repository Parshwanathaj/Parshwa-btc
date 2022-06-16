package com.btc.assessment.problems;

public class UniqueArrays {
	public static boolean duplicates(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int a[] = { 101, 105, 106, 107, 108, 109 };
		//int a[]= {201,205,206,207,208,209,201};
		boolean x = duplicates(a);
		System.out.println(x);
	}
}