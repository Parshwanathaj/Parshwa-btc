package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Product;
import com.springboot.app.model.Sales;
import com.springboot.app.repository.IProductRepo;
import com.springboot.app.repository.ISalesRepo;

@Service
public class SalesService implements ISalesService {
	
	@Autowired
	private ISalesRepo salesRepo;
	@Autowired
	private IProductRepo productRepo;
	
	@Override
	public List<Sales> getAllSales() {
		// TODO Auto-generated method stub
		return salesRepo.salesAllList();
	}

	@Override
	public Sales saveSales(Sales sales) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(sales.getProductCodeVal()).get();
		double lineTotal = product.getPrice() * sales.getQuantity();
		sales.setLineTotal(lineTotal);
		sales.setProduct(product);
		return salesRepo.save(sales);
	}
	
}
