package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CalenderStack
{
	
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		utility.calenderStack(month, year);
		
	}
}
