package com.sales.app.main.services;
import java.util.*;

import com.sales.app.main.entities.makesales;
public interface SalesService {

	public List<makesales> getsales();

	public makesales getSales(String salesid);

	public makesales addmakesales(makesales sales);

	public makesales updatemakesales(makesales sales);






	
	
}
