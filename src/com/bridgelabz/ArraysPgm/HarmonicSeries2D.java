package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;
import java.util.*;

public class HarmonicSeries2D 
{

	 	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			 
			System.out.println("Enter range for harmonic series");
			int rng = sc.nextInt();
			double a[][] = new double[1][rng];
			double temp;
			
			for (int i = 1; i <= rng; i++) 
			{
				temp = ArrUtility.harmonicSeries(i);
				a[0][i-1] = temp;
				
			}
			 
			
			for (int i = 0; i < a.length; i++)  /*printing 2D array*/
			{
				for (int j = 0; j < a[i].length; j++)
				{
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();
			 
		}

	 	
	 

}
