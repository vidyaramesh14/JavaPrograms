package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class SecretNumber {

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int N=(int)Math.pow(2, n)-1;
		System.out.println("select a number between 0 to "+N);
		int no_of_times=Utility.findSecretNumber(N);
		System.out.println("computer took "+ no_of_times+" times  to find Your number" );
	}

}
