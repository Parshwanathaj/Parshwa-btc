package com.btc.practice;

public class Assessment20
{
	public static void main(String[] args)
	{
		String[] ip = { "Vikas", "Lokesh", "Ashok" };
		getTheNamesinGivenFormat(ip);
	}

	public static void getTheNamesinGivenFormat(String[] ip) {
		StringBuffer sb = new StringBuffer();
		sb.append('"');
		for (int i = 0; i < ip.length; i++)
			sb.append(ip[i]).append(',');
		sb.deleteCharAt(sb.length() - 1);
		sb.append('"');
		System.out.println(sb);
	}
}