package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;
import java.util.*;

public class DistinctCupon2 
{
	public static void main(String[] args) 
	{
		 
		Scanner sc = new Scanner(System.in);
		int range;
		System.out.println("enter how many times generate coupons");
		range = sc.nextInt();
		int[] arr=new int[range];
		
		int coupon;
		for (int i = 0; i < range; i++) 
		{
			coupon = ArrUtility.randomNumber(range); // 2
			arr[i]=coupon;

		}
		 
		Arrays.sort(arr);   /*Array sorting*/
		
	 
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); /*printing distinct numbers from array*/
		
        for (int i = 0; i < arr.length; i++) 
        { 
            hashMap.put(arr[i], i); 
        } 
      
        System.out.println(hashMap.keySet());/*Using hashMap.keySet() to print output reduces time complexity.*/
		
		
		sc.close();

	}
}
