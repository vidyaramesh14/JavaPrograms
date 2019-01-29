package com.bridgelabz.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	
	public class PrimeNumbers {

		public static void main(String[] args)
		{	Scanner sc1=new Scanner(System.in);
			System.out.println("enter the lower limit");
			int l=sc1.nextInt();
			System.out.println("enter the upper limit");
			int u=sc1.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			list=Utility.isPrime(l,u);
			//int count=0;
			for(int i:list)
			{
				//count++;
				System.out.print(i+" ");
			}
			//System.out.println(count);
			sc1.close();
		}

	}


