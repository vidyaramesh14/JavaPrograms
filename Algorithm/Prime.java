package com.bridgelabz.Algorithm;

import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter range of prime number : \n");
		int range=sc1.nextInt();
	
		List prime_Numbers=Utility.printingPrimeNumber(range);
		System.out.println(prime_Numbers.size());
		System.out.println(prime_Numbers);
	}
}
