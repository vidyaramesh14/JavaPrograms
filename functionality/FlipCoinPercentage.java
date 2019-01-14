package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoinPercentage 
{

	public static void main(String[] args)

	{  
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number of times the coin is being flipped");
		int n=sc1.nextInt(); // reading integer from the user
		int  tail_percentage= Utility.flipCoin(n);
		int head_percentage=100-tail_percentage;
		System.out.println(" Percentage of Head vs Tails: " +head_percentage+ ":"+tail_percentage);
	}


}
