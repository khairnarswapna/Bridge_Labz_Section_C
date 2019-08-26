package com.bridgelabz.Search;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.SearchUtility;

public class IntBinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] arr = { 22, 11, 33, 44, 55, 66, 99, 88, 77 };
		Arrays.parallelSort(arr);
		System.out.println("Enter number to find in array");
		int key = sc.nextInt();
		int index = SearchUtility.integerBinarySearch(arr, key);
		if (index == -1)
			System.out.println("key not found");
		else
			System.out.println("key found : at index :" + index);
		 
	}

}