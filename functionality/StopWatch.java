package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter zero to start timer ");
		int start=sc1.nextInt();
		long res1=Utility.StartTime(start);
	
		System.out.println("Enter one to end timer ");
		int end=sc1.nextInt();
		long res2=Utility.EndTime(end);
		long result =Utility.ElapsedTime(res1, res2);
		System.out.println("ElapsedTime is:\t"+result+"sec");

	}

}
