package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class GenericsBinary {

	public static void main(String[] args)
	{
		//Integer[] a= {1,2,3,4,5,6};
		//Integer key=6;
		String[] a= {"a","b","c"};
		String key="c";
	Integer result=	Utility.genericsBinarySearch(a, key);
	if(result==-1)
	{
		System.out.println(key+" is not present in given array");
	}
	else {
		System.out.println(key+" is  present in given array in position "+result);
		}
	}

}
