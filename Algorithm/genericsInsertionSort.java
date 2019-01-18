package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class genericsInsertionSort
{
	public static void main(String[] args)
    {
		//Integer[] arr1 = {9,14,3,2,43,11};   
		//Integer[] res=  Utility.InsertionSortInteger(arr1);   

		String[] arr1 = {"vidya","chandu","aadhi"};   
		String[] res=  Utility.InsertionSortInteger(arr1);
		System.out.println(res.getClass().getSimpleName());
		System.out.println("After Insertion Sort");  
		for(String i:res)
		{   
			System.out.print(i+" ");   
		}    
    }
}