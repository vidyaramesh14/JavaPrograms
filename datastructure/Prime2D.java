package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime2D 
{
	public static void main(String[] args) 
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter range to print prim number ");
		int range=sc1.nextInt();
		
		int[] primenumber = Utility.printingPrimeNumber(range);
		
		int[][] result=Utility.twoDPrime(primenumber);
		
	}
}