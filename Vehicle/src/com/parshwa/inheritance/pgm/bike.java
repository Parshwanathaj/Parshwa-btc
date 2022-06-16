package com.parshwa.inheritance.pgm;

public class bike extends vechicles {

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	private boolean abs;

	public void acclerate() {
		System.out.println("accelerating the bike");
	}
}