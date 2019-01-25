package com.bridgelabz.Algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram
{
	public static void main(String[] args) 
	{
		int start=0;
		int end=1000;
		
		List<Integer>list=new ArrayList<Integer>();
		list=Utility.isPrime(start, end);
		
		List<String>l1=new ArrayList<String>();
		for(int i:list)
		{
			l1.add(String.valueOf(i));
		}
		System.out.println(l1);
		
		Set<String>set=new HashSet<String>();
		
		System.out.println("the prime numbers that are Anagram Are: ");
		
		set=Utility.PrimeAnogram(l1);
		System.out.println(set);
		
		Set<String> pal_set=new HashSet<String>();
		System.out.println("The prime numbers which are palindrom");
		
		//Method 3- using static function of AlgorithmUtil class of
		
		pal_set=Utility.PrimePalindrome(l1);
		System.out.println(pal_set);
				

}
	
}
