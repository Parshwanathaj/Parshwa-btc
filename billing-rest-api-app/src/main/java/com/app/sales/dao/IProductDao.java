package com.app.sales.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.sales.bean.Product;

public interface IProductDao extends JpaRepository<Product, String> {
	
	

}
