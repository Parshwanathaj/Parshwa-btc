package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.app.model.Sales;

public interface ISalesRepo extends JpaRepository<Sales, Integer> {
	
	@Query(value = "from Sales s join s.product")
	public List<Sales> salesAllList();
}
