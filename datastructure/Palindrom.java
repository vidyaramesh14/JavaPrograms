package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Palindrom 
{

	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.err.println("enter string input");
		String input=sc1.next();
		
		Deque<Character> deque=new Deque<Character>(500);
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			boolean flag=deque.isFull();
			if(!(flag))
			{
			deque.addRear(c);	
			}
		
		}
		String reverse="";
		do 
		{
			if(deque.isEmpty())
			{
				System.out.println("deque is empty...");
			}
			char c=deque.removeRear();
			reverse+=c;
		}
		while(!(deque.isEmpty()));
		
		
		if(input.equals(reverse))
			{
        	System.out.println(reverse+" is a palindrome...");
			}
        else
        	System.out.println(input+" is not a palindrome...");
		sc1.close();
	}

}
