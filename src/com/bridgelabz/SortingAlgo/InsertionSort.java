package com.bridgelabz.SortingAlgo;
import com.bridgelabz.utility.sortUtility;

public class InsertionSort 
{
	
	public static void main(String[] args)
	{
		String[] strArr= {"Jaya","Rani","damini","jyostana","pushpa"};
		System.out.println("Unsorted String Array");
		sortUtility.printArray(strArr);
		
		System.out.println();
		
		sortUtility.insertionSort(strArr);
		System.out.println("------------------------------------------");
		System.out.println("Sorted String Array using Insertion sort");
		System.out.println("-----------------------------------------");
		sortUtility.printArray(strArr);
	}
}
