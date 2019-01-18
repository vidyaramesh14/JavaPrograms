package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class GenericsBinary {

	public static void main(String[] args)
	{
		//Integer[] a= {1,2,3,4,5,6};
		//Integer key=6;
		String[] a= {"a","b","c","d","e"};
		String key="z";
	    int result = Utility.genericsBinarySearch(a, key);
	    if(result > 0)
	    	System.out.println("found");
	    else
	    	System.out.println(" not found");
	
	}

}
