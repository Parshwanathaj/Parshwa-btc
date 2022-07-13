package com.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private long productCode;
	private String name;
	private String category;
	private String description;
	private double price;
	
	
	public Product() {
	}
	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(long productCode, String name, String category, String description, double price) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", category=" + category + ", description="
				+ description + ", price=" + price + "]";
	}	
		
}
