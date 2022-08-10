package com.sales.app.main.entities;

public class makesales {
	
	private String Name;
	private String Category;
	private String Desciption;
	private int Price;
	public makesales(String name, String category, String desciption, int price) {
		super();
		Name = name;
		Category = category;
		Desciption = desciption;
		Price = price;
	}
	public makesales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDesciption() {
		return Desciption;
	}
	public void setDesciption(String desciption) {
		Desciption = desciption;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "makesales [Name=" + Name + ", Category=" + Category + ", Desciption=" + Desciption + ", Price=" + Price
				+ "]";
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
