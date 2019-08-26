package com.bridgelabz.utility;

import java.util.*;

public class SearchUtility 
{
	
	public static void magicNumber(int range) 
	{
		Scanner sc = new Scanner(System.in);
		int li = 0;
		int hi = range - 1;
		int mi = (li + hi) / 2;

		System.out.println();
		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

		while (li < hi) 
		{
			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = sc.nextInt();
			if (uservalue == 1) 
			{

				hi = mi;
				mi = (li + hi) / 2;

			} else if (uservalue == 2) 
			{
				li = mi+1;
				mi = (li + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
		sc.close();

	}
	public static int integerBinarySearch(int[] arr, int key) 
	{
		
		
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}

	public static int stringBinarySearch(String[] strArr, String key) 
	{
		int start = 0, end = strArr.length - 1, mid;
		while (start <= end) 
		{
			mid = start + (end - start) / 2;
			int result = key.compareTo(strArr[mid]);
			if (result == 0)
				return mid;
			if (result > 0)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	 
}