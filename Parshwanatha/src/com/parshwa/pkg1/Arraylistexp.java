package com.parshwa.pkg1;
import java.util.PriorityQueue;

public class Arraylistexp {
	public static void main(String[] args)
	{
		PriorityQueue<Object> list = new PriorityQueue<Object>();
		
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(7);
		
		System.out.println(list.poll());
	    System.out.println(list.remove());
	    System.out.println(list.peek());
        System.out.println(list.element());
	
     	//	while(list.size()!=0)
		//{
			//System.out.println(list.poll());
		//}
	}
}