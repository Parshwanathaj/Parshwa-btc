package com.springboot.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Product;
import com.springboot.app.repository.IProductRepo;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductRepo repo;
	
	@Override
	@Transactional
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> getAllItems() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product findProductById(long productcode) {
		// TODO Auto-generated method stub
		return repo.findById(productcode).get();
	}	
	
}
