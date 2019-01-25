package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram2D 
{

    public static void main(String[] args) 
    {
		Utility u=new Utility();
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
		Collections.sort(list1);
		u.AnagramPrime(list1);

    }
}
