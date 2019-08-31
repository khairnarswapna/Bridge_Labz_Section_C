package com.bridgelabz.StringRegex;
import com.bridgelabz.utility.StrRegexUtility;

import java.util.*;
public class MsgRegex 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter fullname");
		String FullName=sc.nextLine();
		System.out.println("Enter Mobile No");
		String Mob_no=sc.next();
		
		StrRegexUtility.Message(FullName, Mob_no);
		 

		sc.close();
	}

}
