package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FileBinarySearch {

	public static void main(String[] args)throws Exception
	{
		Scanner sc1=new Scanner(System.in);
		//System.out.println("\nEnter File path : ");
		String path="/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/test.txt";		
		System.out.println("\nEnter a element to search : ");
		String key=sc1.next();	
		System.out.println("press 0 to start ");
		int i=sc1.nextInt();
		long start=Utility.StartTime(i);	
		Utility.binaryFile(path, key);
		long end=Utility.StartTime(1);
		long res=	Utility.ElapsedTime(start, end);
		System.out.println("total timre taken"+res);
	}

}
