package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter first String: \n");
		String a=sc1.next();
		
		System.out.println("Enter second String: \n");
		String b=sc1.next();
		
		boolean result=Utility.checkAnagram(a, b);
		System.out.println(result);
		//result=true? true:false;
		

	}

}
