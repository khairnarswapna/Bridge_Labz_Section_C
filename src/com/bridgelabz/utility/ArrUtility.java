package com.bridgelabz.utility;
import java.util.*;
/*
 * utility for Arrays program
 */
public class ArrUtility 
{
		
    static Scanner sc=new Scanner(System.in);
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
