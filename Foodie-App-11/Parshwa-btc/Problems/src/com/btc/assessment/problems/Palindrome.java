package com.btc.assessment.problems;

public class Palindrome {
	public static void main(String[] args) {
		String Words[] = { "Hannah", "Texas", "Renner", "Eleele" };
		int count = 0;
		for (int i = 0; i < Words.length; i++) {
			String rev = "";
			String temp = Words[i].toLowerCase();

			for (int j = Words[i].length() - 1; j >= 0; j--) {
				rev = rev + Words[i].charAt(j);
			}
			rev = rev.toLowerCase();
			if (temp.equals(rev)) {
				System.out.println(Words[i] + " is a palindrome");
				count++;
			}
		}
		System.out.println("the total numbers of a Palindrome:" + count);
	}
}