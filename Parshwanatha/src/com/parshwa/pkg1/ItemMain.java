package com.parshwa.pkg1;

public class ItemMain {
	public static void main(String[] args) {

		Item item1 = new Item(102111, "AC", 45000);
		Item item2 = new Item(200145, "Phone", 85000);
		Item item3 = new Item(106358, "TV", 50000);
		Item item4 = new Item(321254, "Washing Machine", 100000);
		Item item5 = new Item(124543, "Fan", 150);

		Item[] items = { item1, item2, item3, item4, item5 };

		for (Item item : items) {
			System.out.println(item);
		}
		float max = items[0].getPrice();
		for (int i = 0; i < items.length; i++) {
			if (items[i].getPrice() > max) {
				max = items[i].getPrice();
			}
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("The maximum price is the:" + items);
	}
}