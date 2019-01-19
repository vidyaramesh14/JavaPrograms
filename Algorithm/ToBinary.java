package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinary
{
	public static void main(String[] args) 
	{	Scanner sc1=new Scanner(System.in);
		System.out.println("Enter decimal number : ");
		int decimal=sc1.nextInt();
		Utility.toBinary(decimal);
	}
}
