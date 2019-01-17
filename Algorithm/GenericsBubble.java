package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class GenericsBubble 
{

	public static void main(String[] args)
	{
		//Integer arr[]= {1111,2,343,14};
		//Integer[] result=	Utility.BubbleSortInteger(arr);
		
		String arr[]= {"aaa","zzz","bb","xxx"};
		String[] result=	Utility.genericsBubbleSort(arr);
		
		for(String i:result)
		{
			System.out.print(i+" ");
		}

	}

}
