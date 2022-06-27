package com.assigment.inherit;

public abstract class Item {
	private int identification_number;
	private int num_of_copies;

	public Item(int identification_number, int num_of_copies) {
		super();
		this.identification_number = identification_number;
		this.num_of_copies = num_of_copies;
	}

	public abstract void print();

	public abstract void checkIn();

	public abstract void checkOut();

	public abstract void addItem();

	public int getIdentification_number() {
		return identification_number;
	}

	public void setIdentification_number(int identification_number) {
		this.identification_number = identification_number;
	}

	public int getNum_of_copies() {
		return num_of_copies;
	}

	public void setNum_of_copies(int num_of_copies) {
		this.num_of_copies = num_of_copies;
	}

	@Override
	public String toString() {
		return "Item [identification_number=" + identification_number + ", num_of_copies=" + num_of_copies + "]";
	}

}
