package com.parshwa.pkg1;

public class Abc
{
	int a=10;
	static int b=20;
	public static void main(String[]args)
	{
		Abc ob1=new Abc();
		Abc ob2=new Abc();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.a=1000;
		ob1.b=2000;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		Abc ch2=new Abc();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
	}

}