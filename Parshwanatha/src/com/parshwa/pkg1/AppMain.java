package com.parshwa.pkg1;

public class AppMain {

	public static void main(String[] args) {

		Itemss item1 = new Itemss(102111, "AC", 45000);
		Itemss item2 = new Itemss(200145, "Phone", 85000);
		Itemss item3 = new Itemss(106358, "TV", 50000);
		Itemss item4 = new Itemss(321254, "Washing Machine", 100000);
		Itemss item5 = new Itemss(124543, "Fan", 15000);
		Itemss[] items = new Itemss[5];

		items[0] = item1;
		items[1] = item2;
		items[2] = item3;
		items[3] = item4;
		items[4] = item5;

		for (Itemss item : items) {
			if (item == null) {
				break;
			}
			System.out.println(item);
		}

//		item1.setId(1000101);
//		item1.setItemName("Camera");
//		item1.setPrice(75000);
//      item1.showItemDetails();
//		System.out.println(item1);
	}
}