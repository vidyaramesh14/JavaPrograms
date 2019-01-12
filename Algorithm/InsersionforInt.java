package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class InsersionforInt
{
	public static void main(String[] args)
    {
         int[] arr1 = {9,14,3,2,43,11,58,22};   
            System.out.println("Before Insertion Sort");   
            for(int i:arr1)
            {   
                System.out.print(i+" ");   
            }   
            System.out.println();   
               
           Utility.InsertionSortInteger(arr1);//sorting array using insertion sort   
              
            System.out.println("After Insertion Sort");   
            for(int i:arr1)
            {   
                System.out.print(i+" ");   
            }    
    }
}