package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a value: \n");
		int a=sc1.nextInt();
		
		System.out.println("Enter a value: \n");
		int b=sc1.nextInt();
		
		System.out.println("Enter a value: \n");
		int c=sc1.nextInt();

		double[] result=Utility.calculatingRoots(a, b, c);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
