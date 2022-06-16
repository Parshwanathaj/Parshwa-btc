package com.btc.practice;

public class Assessment11 
{
	public static int[] retrievePosition(int[] a,int[] b)
	{
		  int[] c=new int[a.length];
		  int i;
		  for(i=0;i<a.length;i++){
		   if(i%2==0)
		    c[i]=b[i];
		   if(i%2!=0)
		    c[i]=a[i]; }
		  return c;
		 }
		 public static void main(String[] args) {
		  int[] a={12,1,32,3};
		  int[] b={0,12,2,23};
		  int[] c=retrievePosition(a,b);
		  for(int d:c)
		   System.out.println(d);
		 }
}