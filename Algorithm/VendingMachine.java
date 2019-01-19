package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter rupees :");
		int rupees=sc1.nextInt();
		int[] notes_type= {2000,1000,500,200,100,50,20,10,5};
		Utility.vendingMachine (rupees,notes_type );

	}

}
