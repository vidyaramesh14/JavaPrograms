package com.bridgelabz.functionality;

import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.utility.Utility;

public class DistinctCoupon
{
		public static void main(String[] args) 
		{

			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter how many distinct coupons you wants to generate :");
			int No_Of_Times=sc1.nextInt();
		
			Set s=Utility.distinctCoupon(No_Of_Times);
			System.out.println("distinct coupon are:\n "+s);
		}
	}
