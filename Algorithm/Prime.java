package com.bridgelabz.Algorithm;

import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter range : ");
	    int range= sc1.nextInt();
		int[] primenumber = new int[range];
		primenumber=Utility.printingPrimeNumber(range);
		
		System.out.println("Prime numbers are: " );
		for(int i=0 ; i<range ; i++)
		{
			if(primenumber[i]>1)
			{
			System.out.print(primenumber[i]+" ");
			
			}
		}		
	}
}

