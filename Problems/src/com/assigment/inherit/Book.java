package com.assigment.inherit;

public class Book extends WrittenItem {

	public Book(int identification_number, int num_of_copies, String author) {
		super(identification_number, num_of_copies, author);
	}

	@Override
	public String toString() {
		return "Book [toString()=" + super.toString() + "]";
	}

	@Override
	public void print() {
		System.out.println(this);
	}

	@Override
	public void checkIn() {
		System.out.println("the book is check in");
	}

	@Override
	public void checkOut() {
		System.out.println("the book is check out");
	}

	@Override
	public void addItem() {
		System.out.println("the book is added");
	}

}
