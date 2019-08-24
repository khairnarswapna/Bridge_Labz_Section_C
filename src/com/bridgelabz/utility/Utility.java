package com.bridgelabz.utility;

import java.util.Arrays;

public class Utility 
{
	 
 
		public int AddNum(int n, int n2) 
		{

			return n + n2;

		}
	    /**************DoubleOpt***********/
		public double CalOpt(double a,double b,double c)
		{
			   return a+b*c;
		}
		public double calOpt1(double a,double b,double c)
		{
			return a*b+c;
		}
		public double calOpt2(double a,double b,double c)
		{
			return c+a /b;
		}
		public double calOpt3(double a,double b,double c)
		{
			return a%b+c;
		}
		
		/*********************Intout************/
		public int CalOpt(int a,int b,int c)
		{
			   return a+b*c;
			
		 
		}
		public int calOpt1(int a,int b, int c)
		{
			return a*b+c;
		}
		public int calOpt2(int a,int b,int c)
		{
			return c+a /b;
		}
		public int calOpt3(int a,int b,int c)
		{
			return a%b+c;
		}
		
		
		///************************************/
		//DayofWeeks
		
		public int CalDayofWeek(int m,int d,int y)	
		{
			int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;
	        
	        return d0 ;
	        
	         
			
		}
		
		///***************//
		//carLoan
		public double CarPayment(double principal,double years,double rate)
		{
			   
			    double  r = (rate / 100) / 12;   
			    double  n = 12 * years;   
			    double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
			    
			    return payment;
			    
		}
		//************//
		//Harmonic Nuber
		
		 public Double HarmonicNumber(double n)
		 {
			 int i;
			 double val=0.0;
			 for(i=1;i<=n;i++)
			 {
				val=val+(1.0/i);
				 
				 
			 }
			 return val;
			 
		 }
		 
		 
		 
		 public String toBinary(int decimal)
			{
		        String binary = "";
		        int value = 0;
		        while(decimal>0) 
		        {
		            value = decimal%2;
		            binary = value+binary;
		            decimal =decimal/2;
		        }
		        while(binary.length()< 8)
		        {
		            binary = 0+ binary;
		        }
		        return binary;
		    }

 
		    public String swapNibbles(String binary) 
		    {
		        String str1,str2,temp1,temp2;
		        
		        str1 = binary.substring(0,4);
		        temp1 = str1;
		        
		        str2 = binary.substring(4,8);
		        temp2 = str2;
		        
		        /*temp = str1;
		        str1 = str2;
		        str2 = temp;	
		        var strAfterSwap = str1 + str2;
		        console.log("String after swapping " +strAfterSwap);*/
		        
		        String strAfterSwap = temp2 + temp1;
		        
		        return strAfterSwap;
		    }
		    
		    public int toDecimal(String swap) 
		    {
		        int decimal = 0;
		        int binaryNumber =Integer.parseInt(swap);
		        int i = 0;
		        while(binaryNumber>0) 
		        {
		            int temp = binaryNumber%10;
		            decimal = (int) (decimal + (temp * Math.pow(2, i)));
		            binaryNumber =(binaryNumber/10);
		            i++;
		        }
		        return decimal;
		 
		    }
		    
		    
		    public int SwapNibbles(int decToBinary) 
		    {
				return (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));

			}
			 
		    
		    
		    //***********Prime Function****************/
		    public static boolean isPrime(int no) 
		    {
				if (no == 0 || no== 1) {
					return false;
				} 
				else 
				{
					for (int i = 2; i <= no / 2; i++) 
					{
						if (no % i == 0) 
						{
							return false;
						}
					}
					return true;
				}

			}
		    
		    public int findRepeatedInArray(int a[])
		    {

				for (int i = 0; i < a.length; i++) 
				{
					for (int j = i + 1; j < a.length; j++) 
					{
						if (a[i] == a[j]) {
							return a[i];
						}
					}
				}
				return 0;

			}
		    
		    //************************************
		    /* function for factorial*/
		    
		    public static int CalculateFactorial(int number) 
		    {
				int fact = 1;
				for (int i = 1; i <= number; i++) 
				{
					fact *= i;
				}
				return fact;
			}
		   /* * *--------------------------------------------------*/
		    public double CalculateAngleX(int ang)
		    {

				return ang % (2 * 180);
			}

		    
		    public void PrintSinXSeries(double angle, int OddSeries) 
		    {

				int count = 1;

				System.out.print("Sin(" + angle + ") = ");
				System.out.print(angle + " - ");
				for (int i = 3; i <= OddSeries;) 
				{
					if (count % 2 != 0) 
					{
						System.out.print(Math.pow(angle, i) + " / " + CalculateFactorial(i));
						if (i != OddSeries)
						{
							System.out.print(" + ");
						}

						count++;

					} else {
						System.out.print(Math.pow(angle, i) + " / " + CalculateFactorial(i));
						if (i != OddSeries) 
						{
							System.out.print(" - ");
						}
						count++;
					}
					
					i = i + 2;

				}
				
				
				

			}
		    
		    public static boolean StringAnagram(char[] str1Array, char[] str2Array) 
		    {
				if (str1Array.length != str2Array.length) 
				{
					return false;
					
				} 
				else 
				{
					Arrays.sort(str1Array);
					Arrays.sort(str2Array);
					for (int i = 0; i < str1Array.length; i++) 
					{
						if (str1Array[i] != str2Array[i]) 
						{
							return false;
						}
					}
					return true;
				}

			}

		 
			public static boolean StringPalindrome(String str)
			{
				String reverse= "";
				for (int i = str.length() - 1; i >= 0; i--) 
				{
					reverse= reverse + str.charAt(i);
				}
				if (str != reverse) 
				{
					return false;
				} else
					return true;
			}

		//}


/*------------------------------------------------------------*/

public boolean LeapYrValidation(int yr) 
{
	if (yr >= 1582 && yr <= 9999)
		return true;
	else

	return false;

}



public boolean leapYear(int yr) 
{

	if (yr % 4 == 0 || yr % 400 == 0 && yr % 100 != 0) {
		return true;
	} else {
		return false;
	}

}


public static int calDayOfWeek(int day, int month, int yr) 
{
	int y1, x, m, d1;
	y1 = yr - (14 - month) / 12;
	x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
	m = month + 12 * ((14 - month) / 12) - 2;
	d1 = (day + x + 31 * m / 12) % 7;
	return d1;
}

 
/* ********** function validation for date**********/
public boolean checkValidateDate(int month, int day, boolean leapYear) 
{

	switch (month) 
	{
	case 1:
		if (day > 0 && day <= 31) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	case 2:
		if (leapYear) 
		{
			if (day > 0 && day <= 29) 
			{
				return true;
			} else {
				return false;
			}

		} else {
			if (day > 0 && day <= 28) 
			{
				return true;
			} else {
				return false;
			}
		}

	case 3:
		if (day > 0 && day <= 31) 
		{
			return true;
		} else {
			return false;
		}
	case 4:
		if (day > 0 && day <= 30) 
		{
			return true;
		} else {
			return false;
		}
	case 5:
		if (day > 0 && day <= 31) 
		{
			return true;
		} else {
			return false;
		}
	case 6:
		if (day > 0 && day <= 30) 
		{
			return true;
		} else {
			return false;
		}
	case 7:
		if (day > 0 && day <= 31) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	case 8:
		if (day > 0 && day <= 31) 
		{
			return true;
		} else {
			return false;
		}
	case 9:
		if (day > 0 && day <= 30) 
		{
			return true;
		} else {
			return false;
		}
	case 10:
		if (day > 0 && day <= 31) 
		{
			return true;
		} else {
			return false;
		}
	case 11:
		if (day > 0 && day <= 30) 
		{
			return true;
		} else {
			return false;
		}
	case 12:
		if (day > 0 && day <= 31) 
		{
			return true;
		} else {
			return false;
		}
	default:
		System.out.println("Please enter valid input");
	}
	return false;

}

 
 
public static int caldaysOfMonth(int month, boolean leapYear) 
{

	switch (month) 
	{
	case 1:
		return 31;
	case 2:
		if (leapYear)
		{
			return 29;
		}
		else
		{
			return 28;
		}
	case 3:
		return 31;
	case 4:
		return 30;
	case 5:
		return 31;
	case 6:
		return 30;
	case 7:
		return 31;
	case 8:
		return 31;
	case 9:
		return 30;
	case 10:
		return 31;
	case 11:
		return 30;
	case 12:
		return 31;
	}
	return 0;

}

 
public static void permutationRecursion(String str, int startIndex, int endIndex) {
	if (startIndex == endIndex) 
	{
		System.out.print(str + " ");

	} else 
	{
		for (int i = startIndex; i <= endIndex; i++) {
			str = swap(str, startIndex, i);
			// System.out.println("x="+str);
			permutationRecursion(str, startIndex + 1, endIndex);
			str = swap(str, startIndex, i);
			// System.out.println("y="+str);
		}
	}

}
  /*swapping of character----------------------------------*/
public static String swap(String str, int i, int j) {
	char temp;
	char[] charArray = str.toCharArray();
	temp = charArray[i];
	charArray[i] = charArray[j];
	charArray[j] = temp;
	return String.valueOf(charArray);
}

public static void permutationIterative(String str) {
	// sort the string in natural order
	char[] s = str.toCharArray();
	int n = str.length();
	Arrays.sort(s);

	while (true) {
		// Print current permutation
		System.out.print(String.valueOf(s) + " ");

		/*
		 * Below code will rearrange the string to next lexicographically ordered
		 * permutation (if any) or return if we are already at highest possible
		 * permutation
		 */

		// Find largest index i such that s[i-1] is less than s[i]
		int i = n - 1;
		while (s[i - 1] >= s[i]) {
			// if i is first index of the string, that means we are
			// already at last possible permutation
			// (string is sorted in reverse order)
			if (--i == 0)
				return;
		}

		// find highest index j to the right of index i such that
		// s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)

		int j = n - 1;
		while (j > i && s[j] <= s[i - 1])
			j--;

		// Swap characters at index i-1 with index j
		swap(s, i - 1, j);

		// reverse the substring s[i..n-1] and return true
		reverse(s, i, n - 1);
	}
}

// Utility function to swap two characters in a character array
private static void swap(char[] arr, int i, int j) {
	char c = arr[i];
	arr[i] = arr[j];
	arr[j] = c;
}

// Utility function to reverse a char array between specified indices
private static void reverse(char[] arr, int i, int j) {
	// do till two end-points intersect
	while (i < j) {
		swap(arr, i++, j--);
	}
}




/*-----------------------------------
 * Static function Utility
 */
/*---------------------------------------------*/

/**function for binary*/

public static String Binary(int decimalno)
{

		String a=" ";
		if(decimalno>255)
		{
			System.out.println("Enter the no between 255");
		}
		else
		{
				while(decimalno>0)
				{
					int m=decimalno%2;
					a=m+" "+a;
					decimalno=decimalno/2;
					
				}
		}
		return a;
}


 

public double max(double a[])
{
	double max = a[0];
	for (int i = 1; i <= a.length-1; i++) 
	{
		if (a[i] > max) 
		{
			max = a[i];
		}
	}
	return max;
}

public double min(double[] a) 
{
	double min = a[0];
	for (int i = 1; i <= a.length-1; i++) 
	{
		if (a[i] < min) {
			min = a[i];
		}
	}
	return min;
}

public static double Mean(double a[]) 
{
	double sum = 0;
	for (int i = 0; i <= a.length-1; i++) 
	{
		sum = sum + a[i];
	}
	return sum / (a.length + 1);
}

public double variance(double a[]) 
{

	int n = a.length + 1;
	double mean = Mean(a);
	double sumTempArr = 0;
	double[] tempArr = new double[n];
	for (int i = 0; i < a.length; i++) 
	{
		tempArr[i] = a[i] - mean;

	}
	for (int i = 0; i < a.length; i++) 
	{
		tempArr[i] = Math.pow(Math.abs(tempArr[i]), 2);

	}
 
	for (int i = 0; i < tempArr.length; i++) 
	{
		sumTempArr += tempArr[i];
	}

	return sumTempArr / (n - 1);

}

public double standardDeviation(double[] arr) 
{
	return Math.sqrt(variance(arr));
} 

public static double Median(double[] arr) {
	// First we sort the array
	Arrays.sort(arr);
	int n = arr.length;
	// check for even case
	if (n % 2 != 0)
		return (double) arr[n / 2];

	return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
}


public static double findSqrtNewtonsMethod(int c, double epsilon) 
{
	double t;
	t = c;while (Math.abs(t - c / t) > epsilon * t)
	{
		t = (c / t + t) / 2.0;
	}
	return t;
}



/* *********function for Min Value for Integer array*************/

public static int minValue(int num[]) 
{
	int temp = num[0] < num[1] ? num[0] : num[1];
	
	for (int i = 2; i < num.length; i++) 
	{
		temp = temp < num[i] ? temp : num[i];
	}
	return temp;
}


/* *********Min Value for Integer array*************/

public static int maxValue(int[] num) 
{
	int t = num[0] > num[1] ? num[0] : num[1];
	for (int i = 2; i < num.length; i++) 
	{
		t = t> num[i] ? t : num[i];
	}
	return t;
}


/* ***function for string Min*/

public static String minValue(String str[])
{
	for (int i = 0; i < str.length; i++) 
	{
	
		for (int j = 0; j < str.length; j++) 
		{
		
				if(str[j].compareTo(str[i])<0)
				{
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
		}
		
	}
	return str[0];
	
}


public static String maxValue(String str[])
{
	int strlen=str.length;
	for (int i = 0; i < str.length; i++) 
	{
	
		for (int j = 0; j < str.length; j++) 
		{
		
				if(str[j].compareTo(str[i])<0)
				{
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
		}
		
	}
	return str[strlen-1];
	
}


public static double HarmonicNo(double n)
{
	 int i;
	 double val=0.0;
	 for(i=1;i<=n;i++)
	 {
		val=val+(1.0/i);
		 
		 
	 }
	 return val;
	 
}



public static double futureValue(int c,int r,int t)
{
	return c*Math.pow(1+r,t);

}

public static double presentValue(int c,int r,int t)
{
	return c*Math.pow(c/(1+r),t);

}

/* --------------------------------
 * Collinear function slope
 */

public static boolean chkCollinearSlope(int x1,int x2,int x3,int y1,int y2,int y3)
{
	double SlopeAB,SlopeBC,SlopeAC;
	SlopeAB=(y2-y1)/(x2-x1);
	SlopeBC=(y3-y2)/(x3-x2);
	SlopeAC=(y3-y1)/(x3-x1);
	
	if(SlopeAB==SlopeBC && SlopeAB==SlopeAC)
	{
		return true;
	}
	return false;
	
}

//

/*----------------------
 * Collinear function Area
 * 
 */
public static boolean chkCollinearArea(int x1,int x2,int x3,int y1,int y2,int y3)
{ 
	
		int CalTriangleCollinear=x1*(y2-y3)+y2*(y3-y1)+x3*(y1-y2);
		if(CalTriangleCollinear==0)
			return true;
		return false;
}

}/*body of class*/













		 
		 
		 
		 
		
	//}

//}
