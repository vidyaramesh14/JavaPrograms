package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BinaryInt {

	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6};
		int key=2;
	int result=	Utility.BinarySearchInt(a, key);
	if(result==-1)
	{
		System.out.println(key+" is not present in given array");
	}
	else {
		System.out.println(key+" is  present in given array in position "+result);
		}
	}

}
