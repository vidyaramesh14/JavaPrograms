package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchTree 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.err.println("enter number of nodes...");
		int nodes=sc1.nextInt();	

		/*	the formula is 	 nCr=n!/(n-r)!r!
		 * 
		 * formula for binarySearch 2nCn/(n+1) it becomes(2n!)/(n+1)! *n!
		 */	int result1=Utility.factorial(2*nodes);
		 //System.out.println("result1 :\t"+result1 );
		 int result2=Utility.factorial(nodes +1);
		 //System.out.println("result2 :\t"+result2 );
		 int result3=Utility.factorial(nodes);
		// System.out.println("result3 :\t"+result3 );
		 int finalResult=0;
		 try
		 {
			 finalResult=result1/(result2*result3);
		 }catch(ArithmeticException e)
		 {
			 throw new IllegalArgumentException("you are getting ArithmeticException");
		 }

		 System.out.println("Total numbers of BST is :"+finalResult);
	}

}
