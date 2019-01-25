package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Parentheses 
{
	/*public static void main(String[] args)
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
*/
	//public class BalancedParentheses {

		public static void main(String[] args) {
			Scanner sc1=new Scanner(System.in);
			Stack<Character> expStack = new Stack<>();
			String expression;
			do {
				System.out.println("Enter an arithmetic expression");
				expression = sc1.next();
			}while(expression.equals("") || expression == null);

			
			char ch;
			int index = 0;
			while(index < expression.length())
			{
				ch = expression.charAt(index);
				if(ch == '(' || ch == ')')
				{
					if(ch == '(' && expStack.size() < expStack.getStackCapacity()) 
						expStack.push(ch);
					else if(ch == ')' && !expStack.isEmpty())  {
						expStack.pop();
					}
					else if(expStack.isFull())
					{System.out.println("Stack is full..");
						break;
					}
					else if(expStack.isEmpty())
					{
						System.out.println("Stack is empty..");
						break;
					}
				}
				index++;
			
			}
			
			//check stack still it contains items or not
			if(expStack.isEmpty())
				System.out.println("Given expression is balanced...!");
			else
			{
				System.out.println("Given expression is not balanced...!");
			}

	}

}

