package com.parshwa.pkg1;

class sample1 {
	Double x1=0.0;
	public void displayvalue()
	{
		System.out.println("this:"+this);
		System.out.println("x1:"+this.x1);
		}
}
public class class2 {
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		System.out.println("s1:"+s1);
		sample1 s2=new sample1();
		System.out.println("s2:"+s2);
		s1.displayvalue();
		s2.x1=9.23;
		s2.displayvalue();
	}
}