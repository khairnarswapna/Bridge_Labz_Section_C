package com.bridgelabz.ArraysPgm;

public class TransposeMatrix2D 
{
	 
		public static void main(String args[])
		{  
		 
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
		    
		  
		int transpose[][]=new int[3][3];   
		    
		//Code to transpose a matrix  
		for(int i=0;i<3;i++)
		{    
		for(int j=0;j<3;j++)
		{    
				transpose[i][j]=original[j][i];  
		}    
		}    
		  
		System.out.println();
	 
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++)
		{    
		System.out.print("|");
		for(int j=0;j<3;j++)
		{    
		 
		System.out.print(original[i][j]+" ");    
		}    
		System.out.print("|");
		System.out.println(); 
		}    
		
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++)
		{   
		System.out.print("|");
		for(int j=0;j<3;j++)
		{    
			System.out.print(transpose[i][j]+" ");    
		}
		System.out.print("|");
		System.out.println();
		
		}
		
		 int[][] TranspoMul = new int[3][3];
		 
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						TranspoMul[i][j] += original[i][k] * transpose[k][j];
					}
				}
			}
			System.out.println();
			 
			
			System.out.println("Matrix Multiplication result is:");
			System.out.println( );
			
			for (int[] row : TranspoMul) /*for each loop*/
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

	 
		//}
		
 
 

		
	  

}
