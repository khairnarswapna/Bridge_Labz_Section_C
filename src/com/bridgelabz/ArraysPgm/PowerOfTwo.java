package com.bridgelabz.ArraysPgm;
import java.util.*;

public class PowerOfTwo 
{ 

		 static Scanner sc = new Scanner(System.in);
		 public static void main(String args[])
	     { 
			
			int number;
		 
			PowerOfTwo pw=new PowerOfTwo();
		 

			do
			{
				System.out.println("Enter Number :");
				number = sc.nextInt();
				} while(!chkValidity(number));
				pw.printPowerOfTwo(number);
			}
			
			public static boolean chkValidity(int number) 
			{
				if(number >=0 && number < 31)
					return true;
				else
					return false;
			}
		    public void printPowerOfTwo(int number)
			{
			System.out.println("Power of 2^"+number+" is: "+(Math.pow(2, number)));
	        System.out.println();
	        System.out.println("Printing all till Power Value "+number);
				for(int i=0;i<number;i++){
					System.out.println("2 ^ "+i+" = "+Math.pow(2,i));		
			}
			
				
			}	
		    
	



}
