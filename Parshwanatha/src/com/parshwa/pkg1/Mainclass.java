package com.parshwa.pkg1;
import java.util.Comparator;
import java.util.TreeSet;

class Customized implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2)
	{
		return s1.length()-s2.length();
	}
}
public class Mainclass 
{
	public static void main(String[] args)
	{
		
		Customized c1 = new Customized();
		
		TreeSet t1 = new TreeSet(c1);
		t1.add("aaa");
		t1.add("bb");
		t1.add("eeee");
		t1.add("zzzzz ");
		t1.add("k");
		
		t1.forEach(obj->System.out.println(obj));	
	}
}