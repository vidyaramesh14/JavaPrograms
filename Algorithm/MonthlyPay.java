package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPay 
{
	public static void main(String[] args)throws NumberFormatException
	{
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		double R = Integer.parseInt(args[2]);
		double  MonthlyPay = Utility.monthlyPayment(P, Y, R);
		System.out.println("MonthlyPayment  :"+MonthlyPay);
	}

}
