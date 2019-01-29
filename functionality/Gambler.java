package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Gambler 
{
	    public static void main(String[] args)
	    {	
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter stack value:");
			int stake=sc1.nextInt();
			
			System.out.println("enter Goal value:");
			int Goal=sc1.nextInt();
			
			System.out.println("enter Number of time:");
			int Num=sc1.nextInt();
			int winpercentage=Utility.gamblerGame(stake,Goal,Num);
			int loosepercentage=100-winpercentage;
			System.out.println("Percentage of Win and Loss:\t" +winpercentage+ ":"+loosepercentage);
			sc1.close();
	    	
	     }
}
