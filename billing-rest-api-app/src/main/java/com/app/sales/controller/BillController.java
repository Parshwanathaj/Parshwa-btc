package com.app.sales.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.sales.bean.Product;
import com.app.sales.service.IProductService;

@Controller
public class BillController {
	
	@Autowired
	private IProductService service;
	
	private Map<String,Product> map = new HashMap<String, Product>();
	private List<Product> saveList = new ArrayList<Product>();
	
	@PostMapping("/products")
	@ResponseBody
	public boolean saveProduct(@RequestBody Product prod) {
		Product p=service.insertSalesDetails(prod);
		saveList.add(p);
		return service.insertSalesDetails(prod) != null;
	}
//	
//	@PostMapping("/find")
//	@ResponseBody
//	public Product findProduct(@RequestParam("prodCode") String ProdCode)
//	{
//		
//	}
	
	@RequestMapping("/")
	public String getHomePage()
	{
		return "index.jsp";
	}
	
	@GetMapping("/product-code")
	
	public String findItemById(@RequestParam("prodCode") String prodCode, Model m) {
		Product products=service.findItemDetails(prodCode);
		m.addAttribute("product",products);
		return "show.jsp";
	}
	
	@GetMapping("/product-price")
	public String findPrice(@RequestParam("prodCode") String prodCode, @RequestParam("quantity") int quantity, Model m)
	{
		Product products=service.findItemDetails(prodCode);
		//double d=products.getProdPrice()*quantity;
		//System.out.println(d+"  values ");
		
	
		m.addAttribute("product",products);
		//double d=service.findPriceBasedOnQuantity(prodCode, quantity);
//		System.out.println("code is "+products.getProdCode());
//		String s=saveList.stream().map(null)
//		if(prodCode.contains( saveList)) {
		m.addAttribute("prodCode",prodCode);
//		}
//		else return "error1.jsp";
		if(quantity>0) {
			
		m.addAttribute("quantity", quantity);
		//m.addAttribute("d", d);
		Product product=new Product(prodCode,products.getProdName(),products.getCateogery(),products.getProdDesc(),products.getProdPrice(),quantity);
		map.put(prodCode, product);
		
		return "quantity.jsp";
		}else 
			return "error.jsp";
	}
	
	@GetMapping("/get-all-products")
	public String getAllProducts(Model m) {
		
		List<Product> allProducts=new ArrayList<>(map.values());
		System.out.println(allProducts);
		m.addAttribute("allProducts", allProducts);
		return "all-products.jsp";
	}
	
	@GetMapping("/exit-page")
	public String exitPage()
	{
		return "exit.jsp";
	}

}
