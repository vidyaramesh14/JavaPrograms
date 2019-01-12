package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BubblesortforInteger 
{
	public static void main(String[] args)
    {
        int[]array= {10,30,20,90,50,60,80,8};
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Utility.BubbleSortInteger(array);
       
        for(int j=0;j<len;j++)
        {
            System.out.print(array[j]+" ");
        }

    }
}