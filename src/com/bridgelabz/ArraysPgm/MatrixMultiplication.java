package com.bridgelabz.ArraysPgm;
import java.util.*;

public class MatrixMultiplication 
{
	public static void main(String args[])
	   {
	      int r1, r2,c1,c2,i,j,k;
	      Scanner in= new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of matrix1");
	      r1 = in.nextInt();
	     
	      System.out.println("Enter the number  columns of matrix 1");
	      c1  = in.nextInt();
	     System.out.println("Enter the number of rows of matrix2");
	      r2 = in.nextInt();
	     
	      System.out.println("Enter the number  of columns of matrix 2");
	      c2 = in.nextInt();
	 
	      if(c1==r2)
	     {
	 
	        int A[][] = new int[r1][c1]; 
	        int B[][] = new int[r2][c2]; 
	        int res[][] = new int[r1][c2];
	 
	       System.out.println("Enter the elements of matrix1");
	       
	       for(i=0;i<r1;i++)
	       {
	    	   for(j=0;j<c1;j++)
	    	   {
	    		   A[i][j]=in.nextInt();
	    		   
	  
	    	   }
	    	   System.out.println();
	    	   
	       }
	       
	  
	       System.out.println("Matrix 1:");
	       System.out.println();
	       for(i=0;i<r1;i++)
	       {
	    	   System.out.print("|");
	    	   for(j=0;j<c1;j++)
	    	   {
	    		   System.out.print(A[i][j]+" ");
	    		   
	    	   }
	    	   System.out.print("|");
	    	   System.out.println();
	    	   
	       }
	       
	      System.out.println("Enter the elements of matrix2");
	      
	      

	      System.out.println("Matrix 2:");
	       for(i=0;i<r2;i++)
	       {
	    	   for(j=0;j<c2;j++)
	    	   {
	    		   B[i][j]=in.nextInt();
	    		   
	    	   }
	    	   System.out.println();
	    	   
	       }
	
	      System.out.println("Matrix 2:");
	       for(i=0;i<r2;i++)
	       {
	    	   System.out.print("|");
	    	   for(j=0;j<c2;j++)
	    	   {
	    		   System.out.print(B[i][j]+" ");
	    		   
	    	   }
	    	   System.out.print("|");
	    	   System.out.println();
	    	   
	       }
	      
	     
	       

		       for(i=0;i<r1;i++)
		       {
		    	   for(j=0;j<c2;j++)
		    	   {
		    		   for(k=0;k<r2;k++)
		    		   {
		    		      res[i][j]+=A[i][k]*B[k][j];
		    		   }
		    		   
		    	   }

		    	   
		       }
		       
		       System.out.println("Multiplication of matrix");
		     
		       for(i=0;i<r1;i++)
		       {
		    	   System.out.print("|");
		    	   for(j=0;j<c2;j++)
		    	   {
		    		   System.out.print(res[i][j]+" ");
		    		   
		    	   }
		    	   System.out.print("|");
		    	   System.out.println();
		       }
		
	       
	     
	     }
	else
		
	System.out.print("multipication does not exist ");
	      
	   }

  

}
