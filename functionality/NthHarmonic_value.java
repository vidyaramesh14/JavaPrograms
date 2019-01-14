package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class NthHarmonic_value {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter harmonic value'");
		int i=sc1.nextInt();
		float res=	Utility.harMonicValue(i);
		System.out.println("Nth Harmonic value:\t"+res);
	}

}
