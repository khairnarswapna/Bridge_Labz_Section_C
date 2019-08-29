package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;

public class RepeatedNumber 
{

	public static void main(String[] args) 
	{
		int a[] = new int[100];
	
		for (int i = 0; i < 99; i++) {
			a[i] = i + 1;
		}
		a[99] = (int) (Math.random() * 99 + 1);
		 
		for (int i = 0; i < a.length; i++)  /*for printing array*/
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		 
		int repeatedNum = ArrUtility.RepeatedInArray(a);/*finding repeated array*/
		int[][] repeated = new int[1][1];
		repeated[0][0] = repeatedNum;
		System.out.println("Repeated Number is : " + repeated[0][0]);

	}
}
