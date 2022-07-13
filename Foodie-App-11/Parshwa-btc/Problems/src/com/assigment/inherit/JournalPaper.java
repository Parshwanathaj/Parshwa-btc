package com.assigment.inherit;

public class JournalPaper extends WrittenItem {
	public JournalPaper(int identification_number, int num_of_copies, String author) {
		super(identification_number, num_of_copies, author);
		// TODO Auto-generated constructor stub
	}

	public int getPub_year() {
		return pub_year;
	}

	public void setPub_year(int pub_year) {
		this.pub_year = pub_year;
	}

	private int pub_year;

	@Override
	public void print() {
		System.out.println("journal paper is published");
	}

	@Override
	public void checkIn() {
		System.out.println("journal paper is check in");
	}

	@Override
	public void checkOut() {
		System.out.println("journal paper is check out");
	}

	@Override
	public void addItem() {
		System.out.println("journal is added");
	}
}
