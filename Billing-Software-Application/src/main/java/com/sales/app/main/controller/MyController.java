package com.sales.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sales.app.main.entities.makesales;
import com.sales.app.main.services.SalesService;

@RestController

public class MyController {
	@Autowired
	public SalesService salesservice;
	
	
	@GetMapping("/home")
     public String sales()
     {
    	 return "index.html ";
     }
	//get the courses
	@GetMapping("/sales")
	public List<makesales>getsales()
	{
		return this.salesservice.getsales();
		
	}
	@GetMapping("/sales/{salesid}")
	public makesales getSales(@PathVariable String salesid)
	{
		return this.salesservice.getSales(salesid);
	}
	
	@PostMapping("/sales")
	public makesales addsales(@RequestBody  makesales sales)
{
	return this.salesservice.addmakesales(sales);
}
	@PutMapping("/sales")
	public makesales updatesales(@RequestBody  makesales sales)
{
	return this.salesservice.updatemakesales(sales);
}
}
