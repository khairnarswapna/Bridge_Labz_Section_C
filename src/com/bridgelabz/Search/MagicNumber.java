package com.bridgelabz.Search;

import java.util.*;

import com.bridgelabz.utility.SearchUtility;

public class MagicNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		SearchUtility.magicNumber(range);
		
		 
	}

}
 