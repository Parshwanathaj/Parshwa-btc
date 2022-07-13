package com.parshwa.pkg1;

public class Item {
	private int id;
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String itemName;
	private float price;

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}

	public Item(int id, String itemName, float price) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public int getId() {
		return id;
	}
}