package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Temperature :");
			int temperature=sc1.nextInt();
		
			Utility.temperatureConversion(temperature);
			sc1.close();
	}

}
