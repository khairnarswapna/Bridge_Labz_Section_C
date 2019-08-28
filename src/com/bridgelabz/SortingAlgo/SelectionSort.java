package com.bridgelabz.SortingAlgo;
import com.bridgelabz.utility.sortUtility;

public class SelectionSort 
{
	 public static void main(String a[])
	 {  
	        int[] arr1 = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        
	        int[] Arr=sortUtility.selectionSort(arr1);//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort");  
	        System.out.println("----------------------------------------------");
	        for(int i:Arr)
	        {  
	            System.out.print(i+" ");  
	        } 
	 }
}
