package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Parentheses 
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		String  equation="";
		do {
			System.out.println("Enter equation");
			 equation=sc1.next();
		}
		while(equation==null);


		Stack<Character> stack = new Stack<>();
		char ch;
		
		for(int i=0 ; i<equation.length();i++)
		
		{	ch=equation.charAt(i);
			if(ch == '(')   // if find '(' this push in stack
			{
				stack.push(ch);
			} 
			else if(ch == ')')   //if find ')' this pop it from stack
			{
				stack.pop();
			}
			
		}
		if(stack.isEmpty())
		{
			System.out.println("equation is balanced "); //if at the end stack is empty
			//expression is balanced else not
		}
		else
			System.out.println("equation is not balanced ");
	}



}

