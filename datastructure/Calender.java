package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calender
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter month : ");
		int month = sc1.nextInt();
		System.out.println("Enter year : ");
		int year = sc1.nextInt();
		utility.printCalender(month, year);
	}
}

