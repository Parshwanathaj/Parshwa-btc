package com.parshwa.pkg1;

public class ShortestWord {
	public static void main(String args[]) {
		String[] words = { "Atrocity", "Pensive", "Imperceptible", "Discordant" };
		String shortest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() <= shortest.length()) {
				shortest = words[i];
			}
		}
		System.out.println("shortest word is : " + shortest);
	}
}