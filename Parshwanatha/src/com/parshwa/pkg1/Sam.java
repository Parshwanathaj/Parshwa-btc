package com.parshwa.pkg1;
import java.util.Scanner;
public class Sam
{
public void test(int m,int a,int d,String str,int in)
{
int res=in;
for(int i=0;i<str.length();i++)
{

if(str.charAt(i)=='m')
{
res=res*m;
}
else if(str.charAt(i)=='a')
{
res=res+a;
}
else if(str.charAt(i)=='d')
{
res=res/d;
}
else if(str.charAt(i)=='s')
{
}
}
System.out.println("Result " +res);
}
public static void main(String[] args) 
{
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the operation Seqeunce");
   String op = myObj.nextLine();
 
    System.out.println("Enter initial value");
    int in=myObj.nextInt();
   
   System.out.println("Enter initial m");
   int in1=myObj.nextInt();
 
   System.out.println("Enter initial a");
   int in2=myObj.nextInt();
   
   System.out.println("Enter initial d");
   int in3=myObj.nextInt();
   
   Sam s=new Sam();
         s.test(in1, in2, in3,op,in);
}
}
