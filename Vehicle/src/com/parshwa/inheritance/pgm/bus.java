package com.parshwa.inheritance.pgm;

public class bus extends vechicles
{
	private int capacity;
public void horn()
{
	System.out.println("Bus makes the horn");
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
}