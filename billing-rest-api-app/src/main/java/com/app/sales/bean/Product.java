package com.app.sales.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String prodCode;
	private String prodName;
	private String cateogery;
	private String prodDesc;
	private double prodPrice;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String prodCode, String prodName, String cateogery, String prodDesc, double prodPrice,
			int quantity) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.cateogery = cateogery;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	public Product(String prodCode, String prodName, String cateogery, String prodDesc, double prodPrice) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.cateogery = cateogery;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
		this.quantity=quantity;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCateogery() {
		return cateogery;
	}
	public void setCateogery(String cateogery) {
		this.cateogery = cateogery;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodCode=" + prodCode + ", prodName=" + prodName + ", cateogery=" + cateogery + ", prodDesc="
				+ prodDesc + ", prodPrice=" + prodPrice + "]";
	}
	
	
	

}
