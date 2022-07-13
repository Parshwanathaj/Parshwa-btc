package com.parshwa.pkg1;

import java.util.ArrayList;

public class collectionDemo 
{
	public static void main(String [] args)
	{
		ArrayList a1= new ArralyList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		
		System.out.println(a1);
		
		ArrayList a12=new ArrayList();
		a12.add("abb");
		a12.add("bbb");
		a12.add("ccc");
		
		System.out.println(a12);
		
		a1.addAll(a12);
		System.out.println(a1);
		
	}
}
