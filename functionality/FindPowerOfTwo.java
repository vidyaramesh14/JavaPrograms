package com.bridgelabz.functionality;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindPowerOfTwo 
{
	
		public static void main(String[] args)throws IOException  
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter base value :");
			int b=sc1.nextInt();
			System.out.println("Enter power value :");
			int p=sc1.nextInt();
			int result=Utility.powerOfTwo(b,p);
			if(result==-1)
			{
				System.out.println("give correct value");
			}
			else
				System.out.println(result);
		}
	
}
