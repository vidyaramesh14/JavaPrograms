package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BubblesortforInteger 
{
	public static void main(String[] args)
    {
        int[]array= {10,30,20,90,50,60,80,8};
       
      int[] res=  Utility.BubbleSortInteger(array);
       
        for(int j=0;j<res.length;j++)
        {
            System.out.print(res[j]+" ");
        }

    }
}