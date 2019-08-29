package com.bridgelabz.utility;
import java.util.*;
/*
 * utility for Arrays program
 */
public class ArrUtility 
{
		
    static Scanner sc=new Scanner(System.in);
    
    
    public static int findDistinctTriplets(int b[],int length)//method 1
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		// return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
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
	public static boolean isPrime(int num) 
	{
		if (num == 0 || num == 1)
			return false;//
		else {
			for (int i = 2; i < num / 2; i++) 
			{
				if (num % i == 0) 
				{
					return false;//
				}
			}
		}

		return true;
	}
	
	public static boolean isAnagram(int no1, int no2) 
	{
		 String str1, str2;
		 
		str1 = String.valueOf(no1);
		str2 = String.valueOf(no2);
		int str1len=str1.length();
		int str2len=str2.length();
		char[] char1 = new char[str1len];
		char[] char2 = new char[str2len];
		
		if (str1.length() != str2.length()) 
		{
			return false;
		} 
		else 
		{
			 
			for (int i = 0; i < char1.length; i++) 
			{
				char1[i] = str1.charAt(i);
			}
			for (int i = 0; i < char2.length; i++) 
			{
				char2[i] = str2.charAt(i);
			}
			Arrays.sort(char1); /*sorting of both array*/
			Arrays.sort(char2);

			if (Arrays.equals(char1, char2)) 
			{
				return true;
			} 
			else 
			{

				return false;
			}
		}

	}

	/*function for caldayofweek*/
	
	public static int calDayOfWeek(int day, int month, int yr) 	
	{
		int y1, x, m, d1;
		y1 = yr - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	public static double harmonicSeries(int num) 
	{
		double sum = 1;
		if (num == 1) {
			return 1.0;
		} else {
			for (int i = 2; i <= num; i++) {
				sum = sum + ((double) 1 / i);
			}
			return sum;
		}

	}
	
	public static int RepeatedInArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return a[i];
				}
			}
		}
		return 0;
	}
	
	
	public void gamlingSimulation(int stake, int goal, int day) 
	{
		int tmpstake = stake, win = 0,loss = 0;
		for (int i = 0; i < day; i++) 
		{
			while (tmpstake > 0 && tmpstake < goal) 
			{
				if (Math.random() < 0.5) 
				{
					tmpstake++;
					win++;
				} else 
				{
					tmpstake--;
					loss++;// lose
				}
				if (tmpstake == goal) 
				{
					win++;
				}
			}
		}

		int a[][] = new int[2][1];
		a[0][0] = win;
		a[1][0] = loss;

		System.out.println("the number of times the game won is " + a[0][0]);
		System.out.println("The number of times the game loss is " + a[1][0]);

	}

	

}
