package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

import com.bridgelabz.utility.Utility;

public class PrimeQueue 
{
	

		public static void main(String[] args) 
		{
			MyQueue<Integer> queue=new MyQueue<>();	// creating the queue objects
			Set<String>set=new HashSet<String>();
			List<Integer>list=new ArrayList<Integer>();
			List<Integer>list1=new ArrayList<Integer>();
			List<String>l1=new ArrayList<String>();
			list=Utility.isPrime(0, 1000);	// checking the prime number 
			for(int i:list)
			{
				l1.add(String.valueOf(i));
			}
			set=Utility.PrimeAnogram(l1);	// checking the anagram
			for(String str:set)
			{
				list1.add(Integer.valueOf(str));
			}
			Collections.sort(list1);
			//System.out.println(list1);
			for(int i=0;i<list1.size();i++)
			{
				queue.enqueue(list1.get(i));	// passing the data to the enqueue
			}
			int an=0;
			for(int j=0;j<list1.size();j++)
			{
				an=queue.dequeue();		//Dequeuing the data
				System.out.print(an+",");
			}
			
		}

}
