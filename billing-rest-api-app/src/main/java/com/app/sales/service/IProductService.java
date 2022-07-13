package com.app.sales.service;

import com.app.sales.bean.Product;

public interface IProductService {
	public Product insertSalesDetails(Product prod); 
	public Product findItemDetails(String prodCode);
	public double findPriceBasedOnQuantity(String ProdCode,int quantity);

}
