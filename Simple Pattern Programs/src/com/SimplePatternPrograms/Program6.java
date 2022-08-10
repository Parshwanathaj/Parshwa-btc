package com.SimplePatternPrograms;

public class Program6 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 0; i < n; i++) 
		{
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) 
			{
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
//public class Pascal {
//    public static void main(String[] args) {
//        int lines = 5;
//        int num = 1;
//
//        for(int i=0; i<lines; i++){
//            num=1;
//            System.out.printf("%"+(lines-i)+"s","");
//            for(int j=0; j<=i; j++){
//                System.out.print(num+"  ");
//                num = num * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }
//
//    }
//}