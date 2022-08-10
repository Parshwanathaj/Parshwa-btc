package com.sales.app.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sales.app.main.entities.makesales;
@Service
public class Salesserviceimpl implements SalesService {

	List<makesales> list;
	
	public Salesserviceimpl() {
		list=new ArrayList<>();
		list.add(new makesales("megha","book","Roald dahl Charlie",500));
		list.add(new makesales("mitali","pen","gelpen",50));
		list.add(new makesales("gaurav","java course","contain java core courses",5000));
		
	}
	
	@Override
	public List<makesales>getsales() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public makesales getSales(String salesid) {
		makesales  s=null;
		for(makesales sales:list)
		{
			if(s.getId()==salesid)
			{
				
				s=sales;
				break;
			}
		}
		return s;
	}


	@Override
	public makesales addmakesales(makesales sales) {
		list.add(sales);
		return sales;
	}


	@Override
	public makesales updatemakesales(makesales sales) {
		// TODO Auto-generated method stub
		return null;
	}

}
