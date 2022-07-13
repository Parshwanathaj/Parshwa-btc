package com.parshwa.pkg1;
import java.util.Scanner;

public class calculattor 
{
  public static void main(String[]args)
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("enter first no1.");
	  int no1=s.nextInt();
	  System.out.println("enter secod no2.");
	  int no2=s.nextInt();
	  System.out.println("select symbol(+,-,*,/)");
	  String sym=s.next();
	  int res;
	  switch(sym)
	  {
	  case "+":res=no1+no2;
	  System.out.println("addition :"+res);
	  		break;
	  case "-":res=no1-no2;
	  System.out.println("substraction :"+res);
	  		break;
	  case "/":res=no1/no2;
	  System.out.println("division :"+res);
	  		break;
	  case "*":res=no1*no2;
	  System.out.println("multiplication :"+res);
	  		break;
	  default : System.out.println("invaild symbol");
	  		break;
	  }	  
  }
}