package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindLeapYear 
{
	
		public static void main(String args[])
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("\nEnter year : ");
			int yearnumber=sc1.nextInt();
			boolean b=Utility.leapYear(yearnumber);
			if(b==true)
			{
				System.out.println(yearnumber+" is leapYear ");
			}else
			System.out.println(yearnumber+" is not leapYear ");
		}
	
}
