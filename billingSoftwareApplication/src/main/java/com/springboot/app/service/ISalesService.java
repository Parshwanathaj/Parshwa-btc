package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Sales;

public interface ISalesService {
	public List<Sales> getAllSales();
	
	public Sales saveSales(Sales sales);
}
