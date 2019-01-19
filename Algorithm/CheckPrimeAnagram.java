package com.bridgelabz.Algorithm;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.utility.Utility;

public class CheckPrimeAnagram {

	public static void main(String[] args) 
	{
		int[] sample= {121,131,113,112};
		int[] result=Utility.checkAnagram(sample);
		for(int i:result)
		{
			if(i>0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
