package com.bridgelabz.Search;
import com.bridgelabz.utility.SearchUtility;
import java .util.*;

public class IntBinarySearch 
{
	Scanner scanner=new Scanner(System.in);
	int[] a = { 2, 1, 3, 4, 5, 6, 9, 8, 7 };
	Arrays.parallelSort(a);
	
	System.out.println("Enter number to find in array");
	int key = scanner.nextInt();
	int index = SearchUtility.integerBinarySearch(a, key);
	if (index == -1)
		System.out.println("key not found");
	else
		System.out.println("key found : at index :" + index);
	 

}
