package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DistinctTriplet {

	public static void main(String[] args)
	{	
		Scanner sc1=new Scanner(System.in);
		System.out.println("\nEnter the size of array : ");
		int n=sc1.nextInt();
		int[] a= new int[n];
		System.out.println("Enter an array element : \n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc1.nextInt();
		}
		int res=Utility.triplets(a, n);
		System.out.println("number of distinct triplets :"+res);
	}

}
