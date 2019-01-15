package com.bridgelabz.functionality;

import com.bridgelabz.utility.Utility;

public class Distance 
{
		public static void main(String[] args) 
		{
			
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			double result=Utility.euclideanDistance(x, y);
			System.out.println("the EuclideanDistance is:  "+result);
		}	
	
}
