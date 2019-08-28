package com.bridgelabz.ArraysPgm;

import com.bridgelabz.utility.ArrUtility;

public class PrimeAnagramRange 
{
	static int[][] primeAnagramNum = new int[10][];
	static int beg=0,end=100;
	static int J=0,K=0;
	public static void main(String[] args) 
	{ 
		 // declaration of array 
		for (int i = 0; i < 10; i++) 
		{
			for (int j =beg; j <= end; j++) 
			{
				if (ArrUtility.isPrime(j)) 
				{
					for (int k = j + 1; k < end; k++) 
					{
						if (ArrUtility.isPrime(k)) 
						{
							if (ArrUtility.isAnagram(j, k)) 
							{
								J=J+2;
							}
						}
					}

				}
			}
			primeAnagramNum[i] = new int[J];
			
		    beg = end + 1; 
			end += 100;
			J = 0;

		}
		
		beg = 0;
		end = 100;
		 
		/*putting values in array*/
		for (int i = 0; i < 10; i++) 
		{
			for (int j =beg; j <= end; j++) 
			{
				if (ArrUtility.isPrime(j)) 
				{
					for (int k = j + 1; k < end; k++) 
					{
						if (ArrUtility.isPrime(k)) 
						{
							if (ArrUtility.isAnagram(j, k)) 
							{
								primeAnagramNum[i][K]=j;
								primeAnagramNum[i][K+1]=k;
								K=K+2;
							}
						}
					}

				}
			}
			beg = end + 1;
			end += 100;
			K = 0;
		}

		// printing array
		for (int i = 0; i < primeAnagramNum .length; i++) 
		{
			for (int j = 0; j < primeAnagramNum [i].length; j++)
				System.out.print(primeAnagramNum [i][j] + " ");
			System.out.println();
		}
	}

}
