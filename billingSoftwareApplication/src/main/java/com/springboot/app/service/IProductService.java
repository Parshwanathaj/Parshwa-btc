package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Product;

public interface IProductService {
	public Product saveProduct(Product product);
	
	public List<Product> getAllItems();
	
	public Product findProductById(long productcode);
}
