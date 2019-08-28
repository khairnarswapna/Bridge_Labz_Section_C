package com.bridgelabz.ArraysPgm;

import com.bridgelabz.utility.ArrUtility;
import java.util.*;

public class Calender2 
{

	
		static int[][] calender = new int[5][7];
		static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		static void initCal() 
		{
			for (int i = 0; i < calender.length; i++) {
				for (int j = 0; j < calender[i].length; j++) {
					calender[i][j] = -10;
				}
			}
		}

		static void display(int m) 
		{
			System.out.println("     Sun	Mon	Tue	Wed	Thu	Fri	Sat");

			for (int i = 0; i < calender.length; i++) 
			{
				for (int j = 0; j < calender[i].length; j++) 
				{
					if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) 
					{
						System.out.print("\t ");
					} else if (calender[i][j] > 0) {
						System.out.print("\t" + calender[i][j] + " ");
					}
				}
				System.out.println("\t");
			}
		}

		static void putCalender(int d) 
		{
			int d1 = 1;
			for (int i = d; i < calender[0].length; i++) 
			{
				// System.out.print(d1);
				calender[0][i] = d1++;
			}
			for (int i = 1; i < calender.length; i++) {
				for (int j = 0; j < calender[i].length; j++) {
					calender[i][j] = d1++;
				}
			}

		}

		static void dispCalender(int D,int M, int Y) 
		{
			int d =ArrUtility.calDayOfWeek(D,M, Y);
			initCal();
			putCalender(d);
			display(M);

		}

		 
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter Day");
			int d = s.nextInt();
			System.out.println("enter month");
			int m = s.nextInt();
			System.out.println("Enter year");
			int y=s.nextInt();
			dispCalender(d,m,y);
		}
	
}
