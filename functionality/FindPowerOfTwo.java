package com.bridgelabz.functionality;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindPowerOfTwo 
{
	static int p;
	
		public static void main(String[] args)throws IOException  
		{
			Scanner sc1=new Scanner(System.in);
				int b=2;
			System.out.println("Enter power value :");
		    int p=sc1.nextInt();
		
		/*	while(p>=31 || p<=0)
			{
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter power value :");
				 p=sc1.nextInt();
			}*/
			int result=Utility.powerOfTwo(b,p);
			if(result==-1)
			{
				System.out.println("give correct value");
			}
			else
				System.out.println(result);
		}
	
}
