package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;
import java.util.*;

public class PrimeRange 
{

	static int[][] primeNum = new int[10][];
	static int start = 0,end = 100;
	
	public static void main(String[] args) 
	{

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) 
		{
			for (int j = start; j <= end; j++) 
			{
				if (ArrUtility.isPrime(j)) 
				{
					j1++;
				}
			}
			primeNum[i] = new int[j1];
			start = end+1;
			end += 100;
			j1 = 0;
			

		}
		start = 0;
		end = 100;
		//putting values in array
		for (int i = 0; i < 10; i++)
		{
			for (int j = start; j <= end; j++) 
			{

				if (ArrUtility.isPrime(j)) 
				{
					primeNum[i][j2] = j;
					j2++;
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeNum.length; i++) 
		{
			for (int j = 0; j < primeNum[i].length; j++)
			{
				System.out.print(primeNum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
