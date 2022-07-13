package com.parshwa.pkg1;
import java.util.LinkedList;

public class Arraylistexp1 {
	public static void main(String[] args)
	{
		LinkedList<Object> list = new LinkedList<Object>();
		
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(null);
		list.add(null);
		
		//System.out.println(list.poll());
        //System.out.println(list.get(2));
		while(list.size()!=0)
		{
			System.out.println(list.poll());
		}		
	}
}