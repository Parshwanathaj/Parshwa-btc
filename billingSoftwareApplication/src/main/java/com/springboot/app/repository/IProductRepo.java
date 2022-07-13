package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.Product;

public interface IProductRepo extends JpaRepository<Product, Long> {

}
