package com.bridgelabz.ArraysPgm;

public class DeterminatofMat2D 
{

	public static void main(String[] args) 
	{
		 
		int[][] M = {{ 1, 2, 3 }, 
					 { 0, 1, 4 }, 
					 { 5, 6, 0 } };
		
		int[][] M1 = new int[2][2];

		M1[0][0] = M[1][1];
		M1[0][1] = M[1][2];
		M1[1][0] = M[2][1];
		M1[1][1] = M[2][2];
		
		for (int i = 0; i < M.length; i++) 
		{
			System.out.print("|");
			for (int j = 0; j < M.length; j++) 
			{
				System.out.print(M[i][j]+ " ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < M1.length; i++) 
		{
			System.out.print("|");
			for (int j = 0; j < M1.length; j++) 
			{
				System.out.print(M1[i][j]+ " ");
			}
			System.out.print("|");
			System.out.println();
		}
		int detOfM1 = M1[0][0] * M1[1][1] - M1[1][0] * M1[0][1];
		System.out.println();
	    
		M1[0][0] = M[1][0];
		M1[0][1] = M[1][2];
		M1[1][0] = M[2][0];
		M1[1][1] = M[2][2];
		
		for (int i = 0; i < M1.length; i++) 
		 {
			System.out.print("|");
			for (int j = 0; j < M1[i].length; j++) 
			{
				System.out.print(M1[i][j]+ " ");
			}
			System.out.print("|");
			System.out.println();
		} 
		int detOfM2 = M1[0][0] * M1[1][1] - M1[1][0] * M1[0][1];
		System.out.println();
		M1[0][0] = M[1][0];
		M1[0][1] = M[1][1];
		M1[1][0] = M[2][0];
		M1[1][1] = M[2][1];
		
		for (int i = 0; i < M1.length; i++)
		{
			System.out.print("|");
			for (int j = 0; j < M1.length; j++) 
			{
				System.out.print(M1[i][j]+ " ");
			}
			System.out.print("|");
			System.out.println();
		}
		int detOfM3 = M1[0][0] * M1[1][1] - M1[1][0] * M1[0][1];
		System.out.println();
		
		int determinantOfM=1*(detOfM1)-2*(detOfM2)+3*(detOfM3);
	 
		System.out.println("Determinant of M is ==>"+determinantOfM);

	}

}
