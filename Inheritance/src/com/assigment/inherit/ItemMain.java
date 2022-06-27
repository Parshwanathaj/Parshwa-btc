package com.assigment.inherit;

public class ItemMain {

	public static void main(String[] args) {
		Item item;
		item = new Book(1, 2, "Darwin");
		item.print();
		item.checkIn();
		item.checkOut();
		item.addItem();
		System.out.println("==========journal paper====================");
		JournalPaper j = new JournalPaper(10, 20, "Varun");
		j.setPub_year(2020);

		item.print();
		item.checkIn();
		item.checkOut();
		item.addItem();

		System.out.println("=========video============");
		Video v = new Video(1, 2, "neel", "action", 2020);
		System.out.println(v.getIdentification_number());
		System.out.println(v.getNum_of_copies());
		System.out.println(v.getYear());
		System.out.println(v.getDirector());
		System.out.println(v.getGenre());
		v.print();
		v.checkIn();
		v.checkOut();
		v.addItem();
		System.out.println("============cd==============");

		Cd c = new Cd(1, 2, "abc", "fiction");
		System.out.println(c.getIdentification_number());
		System.out.println(c.getNum_of_copies());
		System.out.println(c.getArtist());
		System.out.println(c.getGenre());
	}

}