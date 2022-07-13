package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.app.model.Product;
import com.springboot.app.model.Sales;
import com.springboot.app.service.ProductService;
import com.springboot.app.service.SalesService;

@Controller
public class ProductMVCController {
	
	@Autowired
	private ProductService service;
	@Autowired
	private SalesService salesService;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index.jsp";
	}
	
	@PostMapping("/product-app")
	public String purchaseDetails(@RequestParam("productCode") long productCode,
			@RequestParam("quantity") int quantity,
			Model m
			) {
		Product product = service.findProductById(productCode);
		m.addAttribute("product",product);
		m.addAttribute("quantity", quantity);
		return "salesDetails.jsp";
	}
	
	@PostMapping("/purchase")
	public String purchaseProduct(@RequestParam("productCode") long productCode,
			@RequestParam("quantity") int quantity,
			@RequestParam("option") char option,
			Model m
			) {
			Sales sales = new Sales();
			sales.setProductCodeVal(productCode);
			sales.setQuantity(quantity);
			sales = salesService.saveSales(sales);
			m.addAttribute("sales",sales);
			return "purchase.jsp";
		
	}
}
