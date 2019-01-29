package com.bridgelabz.functionality;

import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc1.next();
		List<String>list=	Utility.permutationRecursion(s, 0, s.length()-1);
		System.out.println(list);
		sc1.close();
	}

}