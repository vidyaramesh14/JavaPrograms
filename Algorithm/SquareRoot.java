package com.bridgelabz.Algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SquareRoot
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter value of c : ");
		Scanner sc1=new Scanner(System.in);
		
		try
		{	
			double c=sc1.nextDouble();
		Utility.sqrtNewtons(c);
		}
	      catch(InputMismatchException e)
		{
		System.out.println("Enter Double value only");
		}
		sc1.close();
		
	}
}
