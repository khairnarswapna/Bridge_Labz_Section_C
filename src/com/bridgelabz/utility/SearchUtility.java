package com.bridgelabz.utility;
import java.util.*;

 

public class SearchUtility 
{
	static Scanner sc=new Scanner(System.in);
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
			} else 
			{
				System.out.println("please enter the valid input");
			}
		}
		System.out.println("Your number is :" + mi);
		sc.close();
		

	}
	public static int integerBinarySearch(int[] arr, int key) 
	{
		
		
		int first= 0,last = arr.length - 1, mid;
		while (first<= last) 
		{
			mid = first + (last - first) / 2;

			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key)
				first = mid + 1;

			else
				last= mid - 1;
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
	
	/***
	 * function for 2D array
	 */
	public static void  IntInputArray(int intA[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter value intA:"+"["+i+"]"+"["+j+"]=");
				intA[i][j]=sc.nextInt();
			}
		}
	}
	public static void IntPrintArray(int intA[][])
	{
		for(int i=0;i<intA.length;i++)
		{
			for(int j=0;j<intA.length;j++)
			{

					System.out.print(intA[i][j]+" ");
				 
			}
			System.out.println();
		}
		 
	}
	public static void  DoubleInputArray(double doubleA[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter value doubleA:"+"["+i+"]"+"["+j+"]=");
				doubleA[i][j]=sc.nextDouble();
			}
		}
	}
	public static void DoublePrintArray(double doubleA[][])
	{
		for(int i=0;i<doubleA.length;i++)
		{
			for(int j=0;j<doubleA.length;j++)
			{

					System.out.print(doubleA[i][j]+" ");
				 
			}
			System.out.println();
		}
		 
	}
	public static void  booleanInputArray(boolean  booleanA[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter value intA:"+"["+i+"]"+"["+j+"]=");
			    booleanA[i][j]=sc.nextBoolean();
			}
		}
		
	}
	public static void booleanPrintArray(boolean booleanA[][])
	{

		for(int i=0;i<booleanA.length;i++)
		{
			for(int j=0;j<booleanA.length;j++)
			{

					System.out.print(booleanA[i][j]+" ");
				 
			}
			System.out.println();
		}
		 
		
	}
	

	 
}