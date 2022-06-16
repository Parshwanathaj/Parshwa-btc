package com.assigment.inherit;

public abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", toString()=" + super.toString() + "]";
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem(int identification_number, int num_of_copies, String author) {
		super(identification_number, num_of_copies);
		this.author = author;
	}
}
