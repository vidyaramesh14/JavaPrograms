package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ArrayOf2D {

	public static void main(String[] args) 
	{Scanner sc1=new Scanner(System.in);
	System.out.println("enter number of rows");
	int row=sc1.nextInt();

	System.out.println("enter number of column");
	int column=sc1.nextInt();
	int[][] res=Utility.twoDarray(row, column);
	
	}

}
