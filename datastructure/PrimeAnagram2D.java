package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram2D 
{

	public static void main(String[] args) 
	{	Scanner sc1=new Scanner(System.in);
	
		System.out.println("Enter range : ");
		int range=sc1.nextInt();
		//int[] primenumber = new int[range];
		int[] primenumber=Utility.printingPrimeNumber(range);
		
		int[] anagram = Utility.checkAnagram(primenumber);		
		int[][] result=Utility.twoDPrimeAnagram(anagram);
    }
}
