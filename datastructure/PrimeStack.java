package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.utility.Utility;


public class PrimeStack {

	public static void main(String[] args) 
	{
	
		
				Stack<Integer>stackInt=new Stack<>();
				/*PrimeAnagram pA=new PrimeAnagram();*/
				Set<String>set=new HashSet<String>();
				List<Integer>list=new ArrayList<Integer>();
				List<Integer>list1=new ArrayList<Integer>();
				List<String>l1=new ArrayList<String>();
				list=Utility.isPrime(0, 1000);
				for(int i:list)
				{
					l1.add(String.valueOf(i));
				}
				set=Utility.PrimeAnogram(l1);
				for(String str:set)
				{
					list1.add(Integer.valueOf(str));
				}
				List<Integer>reverseList=new ArrayList<Integer>();
				Collections.sort(list1);
				
				
				for(int i=0;i<list1.size();i++)
				{
					stackInt.push(list1.get(i));	// pushing the data to stack
				}
				
				for(int j=0;j<list1.size();j++)
		 		{
					int t=stackInt.pop();	// Popping the elements from the stack
					reverseList.add(t);
				}
				System.out.print(reverseList);
				
			}

		
	
}
