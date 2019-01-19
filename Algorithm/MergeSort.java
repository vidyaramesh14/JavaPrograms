package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) 
	{Class Utility=null;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter range of an array");
		int range=sc1.nextInt();
		Integer[] array=new Integer[range];
		System.out.println("enter array element");
		
		
		for(int i=0;i<range;i++)
		{
			array[i]=sc1.nextInt();
		}
		
		//Utility.sort(array,Utility, 0, array.length-1);  
		  
		System.out.println("\nSorted array");  
		for(int i =0; i<array.length;i++)  
		{  
		    System.out.println(array[i]+"");  
		}  
		
		
		
		
		
	}
	

}
