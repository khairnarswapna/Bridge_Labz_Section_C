package com.bridgelabz.SortingAlgo;

import com.bridgelabz.utility.sortUtility;

public class FrequencyCount {

	public static void main(String[] args) 
	{
		String str = "To Be Or Not To Be Be Not";
		String[] strArr = str.split(" ");
		sortUtility.frequencyCount(strArr);

	}

}