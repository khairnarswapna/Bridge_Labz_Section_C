package com.bridgelabz.sort;
 
import com.bridgelabz.utility.sortUtility;
 

public class BubbleSort {

	public static void main(String[] args) 
	{
		 
			int[] a = { 22, 11, 33, 55, 44, 66, 99, 77, 88 };
			System.out.println("Unsorted array\n");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
			System.out.println();
			int[] sortedArr=sortUtility.bubbleSort(a);
			System.out.println("Sorted array\n");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i] + " ");
			
		}


	}

}
