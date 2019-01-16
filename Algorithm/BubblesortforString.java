package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BubblesortforString 
{
	public static void main(String[] args)
    {
       String[] str= {"a","vidya","chandu","addhi"};
        String[] str1=Utility.bubbleString(str);
       
        System.out.println("Sorted array list is:");
        for(int i=0;i<str1.length;i++)
        {
            System.out.println(str1[i]);
        }
    }

}

