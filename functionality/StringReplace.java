package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringReplace
{
	public static void main(String[] args)
		{	Scanner sc1=new Scanner(System.in);
			System.out.println("Please enter your name: ");
			String userName=sc1.next();
			String output = Utility.replaceString( userName);
			System.out.println(output);
		}
}
