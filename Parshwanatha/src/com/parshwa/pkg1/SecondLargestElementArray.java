package com.parshwa.pkg1;
import java.util.Scanner;

public class SecondLargestElementArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	{
			System.out.println("Enter the size of array : ");
			int num = scanner.nextInt();
			int arr[] = new int[num];
			
			System.out.println("Enter the elements of the array : ");
			for(int i=0;i<num;i++) {
				arr[i] = scanner.nextInt();
			}
			int max = Integer.MIN_VALUE;
			
			for(int i=0;i<num;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			int second_max = Integer.MIN_VALUE;
			
			for(int i=0;i<num;i++) {
				if(arr[i] > second_max && arr[i]!=max) {
					second_max = arr[i];
				}
			}
			System.out.println("The second maximum value is : " + second_max);
		}
	}
}