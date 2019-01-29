package com.bridgelabz.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CheckPrimefactor
{
public static void main(String[] args) 
	{	List<Integer> res=new ArrayList<>();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter value:");
		int i=sc1.nextInt();
		 res=	Utility.primeFactors(i);
		System.out.println("Prime Factor of "+i+" is ;\t "+res);
		sc1.close();
	}

}
