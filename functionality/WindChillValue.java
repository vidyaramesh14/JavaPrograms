package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChillValue {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter temperature in  Fahrenheit : ");
		int t=sc1.nextInt();
		
		System.out.println("Enter speed in miles per hour : ");
		int v=sc1.nextInt();
		long res=Utility.windChillCalculation(t, v);
		if(res==0)
		{
			System.out.println("*******Invalid Input********");
		}else
		System.out.println("WindChillValue :"+res);
	}

}
