package com.bridgelabz.SortingAlgo;
import com.bridgelabz.utility.sortUtility;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		String[] strArr= {"jaya","rani","damini","jyostana","pushpa"};
		 
		System.out.println("Unsorted Array");
		sortUtility.printArray(strArr);
		System.out.println();

		sortUtility.mergeSort(strArr, 0, strArr.length - 1);
		
		System.out.println("Sorted Array using Merge sort");
		System.out.println("------------------------------------------");
		sortUtility.printArray(strArr);

	}
}
