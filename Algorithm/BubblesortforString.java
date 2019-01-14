package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class BubblesortforString 
{
	public static void main(String[] args)
    {Utility u=new Utility();
        System.out.println("How many String you want to insert");
      int n=u.inputInteger();
        System.out.println("Enter the Strings ");
        String[] str=new String[n];
        int i;
        for( i=0;i<n;i++)
        {
          //str[i]=u.inputStringWithNext(); 
        }
           
        System.out.println("the original array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
       
        String[] str1=u.bubbleString(n,str);
       
        System.out.println("Sorted array list is:");
        for(i=0;i<n;i++)
        {
            System.out.println(str1[i]);
        }
    }

}

