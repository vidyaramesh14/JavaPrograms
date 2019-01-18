package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleUserInput {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the range of array");
		int range=sc1.nextInt();
		
		String[] array=new String[range];
		System.out.println("Enter array element:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc1.next();
		}
		
		String[] res=  Utility.InsertionSortInteger(array);
		System.out.println(res.getClass().getSimpleName());
		System.out.println("After Insertion Sort");  
		for(String i:res)
		{   
			System.out.print(i+" ");   
		}    
	}

}
