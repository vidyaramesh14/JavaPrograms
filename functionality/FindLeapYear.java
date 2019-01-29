package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindLeapYear 
{
	
		public static void main(String args[])
		{	String temp="";
			int yearnumber;
			Scanner sc1=new Scanner(System.in);
			do
			{
			
			System.out.println("\nEnter year : ");
			yearnumber=sc1.nextInt();
			 temp=String.valueOf(yearnumber);
			}while(temp.length()!=4);
		
		Utility.leapYear(yearnumber);
		sc1.close();
		}
	
}


