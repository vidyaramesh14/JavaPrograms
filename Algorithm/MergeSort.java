package com.bridgelabz.Algorithm;

import java.util.Scanner;
public class MergeSort 
{

	public static void main(String[] args) 
	{
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
		sc1.close();
		
		
		
		
	}
	

}
