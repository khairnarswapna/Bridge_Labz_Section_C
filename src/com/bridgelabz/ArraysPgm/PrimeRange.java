package com.bridgelabz.ArraysPgm;
import java.util.*;
public class PrimeRange 
{

    static Scanner sc=new Scanner(System.in);
    static int i;
   
	public static boolean isPrime(int n) 
	{
		int c = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
				c++;
		}
		if(c == 2)
		
			return true;
		else
			return false;
	}
 
	
	
	public static void main(String[] args) 
	{
		 
		System.out.println("enter the no of row in matrix");
		int m=sc.nextInt();
		System.out.println("enter the no of column in matrix");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		
		int b[]=new int[m*n];
		int k=0;
		while(i < m*n)
		{
			if(isPrime(k)==true)
			{
				b[i] = k;
				i++;
				
			}
			k++;
		}
		int x = 0;
		for(i=0; i<m; i++)
		{
			
			for(int j=0; j<n; j++)
			{
				a[i][j] = b[x];
				x++;
			}
		}
 

		
	}

}
