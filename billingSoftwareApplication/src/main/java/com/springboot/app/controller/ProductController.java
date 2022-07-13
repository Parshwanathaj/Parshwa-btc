package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Product;
import com.springboot.app.model.Sales;
import com.springboot.app.service.ProductService;
import com.springboot.app.service.SalesService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	@Autowired
	private SalesService salesService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllItems();
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		System.out.println(product);
		return service.saveProduct(product);
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/products/sales")
	public Sales saveSales(@RequestBody Sales sales) {
		return salesService.saveSales(sales);
	}
	
	@GetMapping("/products/sales")
	public List<Sales> getAllSales() {
		return salesService.getAllSales();
	}
}
