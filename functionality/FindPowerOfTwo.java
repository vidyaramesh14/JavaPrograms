package com.bridgelabz.functionality;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindPowerOfTwo {
	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		int input=0;
		do
		{
			System.out.println("Enter power value");
			input = sc1.nextInt();
		}while(input > 31 || input < 0);
		
			
			
		System.out.println();
		int base =2;
		Utility.powerOfTwo(base, input);
	}

}
