package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BinaryString {

	public static void main(String[] args) 
	{
		String[] a= {"vidya","chandu","aadhi","kiran","rakshith"};
		String key="aadhi";
		int result=	Utility.binaryString(a,key );
		if(result==-1)
		{
			System.out.println(key+" is not present in given array");
		}
		else {
			System.out.println(key+" is  present in given array in position "+result);
			}
	
	}

}


