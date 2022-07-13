package com.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private long productCodeVal;
	private int quantity;
	private double lineTotal;
	@ManyToOne
	@JoinColumn(name="productCode")
	private Product product;
	
	
	public Sales() {
		super();
	}
	public Sales(long productCodeVal, int quantity) {
		super();
		this.productCodeVal = productCodeVal;
		this.quantity = quantity;
	}
	public Sales(long productCodeVal, int quantity, double lineTotal) {
		super();
		this.productCodeVal = productCodeVal;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductCodeVal() {
		return productCodeVal;
	}
	public void setProductCodeVal(long productCodeVal) {
		this.productCodeVal = productCodeVal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(double lineTotal) {
		this.lineTotal = lineTotal;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Sales [id=" + id + ", productCodeVal=" + productCodeVal + ", quantity=" + quantity + ", lineTotal="
				+ lineTotal + ", product=" + product + "]";
	}
	
	
}
