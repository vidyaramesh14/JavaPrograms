package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TicTacToe {

	public static void main(String[] args)
	{
		
		Scanner sc1=new Scanner(System.in);
		Utility utility = new Utility();
		TicTacToe t = new TicTacToe();
		char[][] gameboard = new char[3][3];
		
		
	
		System.out.println("Enter player symbol :");
		String str1 = sc1.next();
		char usersymbol = str1.charAt(0);
		
		System.out.println("Enter computer symbol :");
		String str2 =sc1.next(); 
		char computersymbol = str2.charAt(0);
		utility.initializeBoard();
		
		System.out.println("\n*********Game Board**********\n");
		utility.displayBoard();
		System.out.println("\nDo you want to turn 1st  y/n : ");
		String str3 = sc1.next();
		char turn = str3.charAt(0);
		int count = 0;
		while(count++<9)
		{
			switch(turn)
			{
			case 'y' :
				System.out.println("\n****Player Turn*****");
				utility.makeMove(usersymbol , 1);
				utility.displayBoard();
				if(utility.winORLose())
				{
					System.out.println("\n******Player Win*****");
					return;
				}
				turn = 'n';
				break;
			case 'n':
				System.out.println("\n*****Computer turn****");
				utility.makeMove(computersymbol,0);				
				utility.displayBoard();
				if(utility.winORLose())
				{
					System.out.println("\n****Computer Win******");
					return;
				}
				turn = 'y';
				break;
			}
		}
		System.out.println("\nGame Draw...!!!!!");
	}
}

