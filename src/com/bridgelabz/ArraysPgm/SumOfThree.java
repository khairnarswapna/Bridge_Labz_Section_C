
/*
 * purpose:Reads in N integers and counts the number of triples that sum to exactly 0. 
 * 
 */
package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;
import java.util.*;
public class SumOfThree 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	 
		System.out.print("Enter Size of Array :");
		int size=sc.nextInt();
		int arr[]=new int [size]; 

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]= sc.nextInt();
		}

		 
		int sum=ArrUtility.findDistinctTriplets(arr,size);//pass the arguments to method 1
		System.out.println("No.of Tripltes :"+sum);
		System.out.println();
	}

}
