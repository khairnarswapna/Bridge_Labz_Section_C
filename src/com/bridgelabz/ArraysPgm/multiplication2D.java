package com.bridgelabz.ArraysPgm;

public class multiplication2D 
{

	 
	public static void main(String[] args) 
	{
	 
		 
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };    // 2x3 Matrix
		int[][] B = { { 1, 2 }, { 3, 2 }, { 4, 5 } };// 3x2 Matrix
		 
		
		int r1 = 2, r2 = 3, c1 = 3, c2 = 2;
		int[][] AB = new int[r1][c2];

		/*AB Matrix */
		if (r2 == c1) 
		{
			 
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < r2; k++) {
						AB[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			 
			System.out.println("AxB is:");
			for (int[] row : AB) 
			{
				 System.out.print("|");  
				for (int col : row) 
				{
					System.out.print(col + " "); /*displaying Result*/
				}
				  System.out.print("|");
				System.out.println();
			}
		}

		// BA B 3x2 A 2x3
	      r1 = 3;
	      c1 = 2;
	      r2 = 2;
	      c2 = 3;
	      
		int[][] BA = new int[r1][c2];
		if (r2 == c1) 
		{
			// BA
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < r2; k++) {
						BA[i][j] += B[i][k] * A[k][j];
					}
				}
			}
			System.out.println();
			 
			
			System.out.println("Matrix result of BxA is:");
			System.out.println( );
			
			for (int[] row : BA) /*for each loop*/
			{
				  
				System.out.print("|");
				for (int column : row) 
				{
					System.out.print(column + "  ");
				}
				 System.out.print("|");
				System.out.println();
			}
		}

	}

}
