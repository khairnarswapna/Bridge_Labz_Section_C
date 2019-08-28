package com.bridgelabz.ArraysPgm;
import java.util.*;



import com.bridgelabz.utility.ArrUtility;

public class TwoDArray 
{

	static Scanner sc=new Scanner(System.in);
	static int row,col,ch;
	
	public static void main(String[] args) 
	{
	  
	
		  do
		  {
			     System.out.println("1.Integer 2D array");
			     System.out.println("2.Double 2D array");
			     System.out.println("3.boolean 2D array ");
			     System.out.println("4.exit");
			     System.out.println("enter your choice:");
			     int ch=sc.nextInt();
			     switch(ch)
			     {
			     case 1:
			    	 	System.out.println("Integer 2D Array:");
			    	 	System.out.println("Enter no of row inseterd in 2D array");
						row=sc.nextInt();
						System.out.println("Enter no of column inseterd in 2D array");
						col=sc.nextInt();
			    	 	int intA[][]=new int[row][col];
			    	 	ArrUtility.IntInputArray(intA,row,col);
			    	 	ArrUtility.IntPrintArray(intA);
					
			    	 break;

			     case 2:
			    	  System.out.println("Double 2D Array:");
			    	  System.out.println("Enter no of row inseterd in 2D array");
					  row=sc.nextInt();
					  System.out.println("Enter no of column inseterd in 2D array");
					  col=sc.nextInt();
					   double doubleA[][]=new double[row][col];
					   ArrUtility.DoubleInputArray(doubleA,row,col);
					   ArrUtility.DoublePrintArray(doubleA);
			    	 break;

			     case 3:
			    	  System.out.println("Double 2D Array:");
			    	  System.out.println("Enter no of row inseterd in 2D array");
					  row=sc.nextInt();
					  System.out.println("Enter no of column inseterd in 2D array");
					  col=sc.nextInt();
					   boolean booleanA[][]=new boolean[row][col];
					   ArrUtility.booleanInputArray(booleanA,row,col);
					   ArrUtility.booleanPrintArray(booleanA);
			    	 break;

			    	 
			    	 
			     case 4:
			    	 		System.exit(0);
			    	 
			     }
			  
		  }while(ch!=4);
		
 
		
	 
		
	 
	}

}
