package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;

public class PrimePalindrom2D 
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 100;

		int[][] primePalindromeNo = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (ArrUtility.isPrime(j)) {
					if (ArrUtility.isPalindrome(j)) {
						j1++;
					}
					
				}
			}
			primePalindromeNo[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		j1 = 0;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++)
			{

				if (ArrUtility.isPrime(j)) 
				{
					if (ArrUtility.isPalindrome(j))
					{
						primePalindromeNo[i][j2] = j;
					j2++;
					}
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i <primePalindromeNo.length; i++) 
		{
			for (int j = 0; j < primePalindromeNo[i].length; j++)
				
				System.out.print(primePalindromeNo[i][j] + " ");
			System.out.println();
		}

	}
 

}
