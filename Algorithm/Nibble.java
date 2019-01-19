package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Nibble {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter  number : ");
		int num=sc1.nextInt();
	int res=Utility.nibbles(num);
	System.out.println(" Decimal value is "+res);
	}
	

}
