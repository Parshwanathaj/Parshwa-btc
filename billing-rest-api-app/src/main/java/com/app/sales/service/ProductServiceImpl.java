package com.app.sales.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.sales.bean.Product;
import com.app.sales.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDao dao;
private Map<String,Product> map = new HashMap<String, Product>();;
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		map=new HashMap<String, Product>();
//		}
	
	@Override
	@Transactional
	public Product insertSalesDetails(Product prod) {
//		map.put(prod.getProdCode(), prod);
		
		return dao.save(prod) ;
	}
	
	@Override
	public Product findItemDetails(String prodCode) {
		
		return dao.findById(prodCode).get();
	}
	@Override
	public double findPriceBasedOnQuantity(String ProdCode, int quantity) {
		System.out.println(map);
		System.out.println("--------");
//		double d=map.get(ProdCode).getProdPrice()*quantity;
		
		return 0;
	}
	

}
