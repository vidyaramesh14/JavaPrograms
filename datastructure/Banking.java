package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Banking
{
	
	double balance;
	MyQueue<Double> queue;

	int size;
	public Banking() {
		balance = 500;
		size =10;
		queue = new MyQueue<Double>(size);
		
	}

	/**
	 * depositing the money
	 * @param amount the deposit amount
	 */
	public void deposit(Double amount) {
		if(queue.isFull()) {
			System.out.println("\t wait for some time...!");
			return;
		}
		queue.enqueue(amount);
		balance+=amount;
	}

	/**
	 * withdrawing the money
	 * @param amount withdraw amount
	 */
	public void withdraw(Double amount) 
	{
		
		if(balance >amount) 
		{
		balance-=amount;
		
		}
	}
	
	public Double checkBalance()
	{
		return balance;
	}



	/**
	 * main function to test the BankingCashCounter class
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Banking counter =  new Banking();
		int operation; // 1=> deposit 2=>withdraw 3=> check balance
		do {
			System.out.println("ENTER YOUR CHOICE: ");
			System.out.println(" 1 => deposit \n 2 => withdraw \n 3 => balance\n 0 => exit");
			operation =sc1.nextInt();
			
			
			switch(operation) {
			case 1 : System.out.println("\tEnter the amount to be deposited...!");
			Double depAmount = sc1.nextDouble();
			counter.deposit(depAmount);
			
			break;

			case 2 : System.out.println("\tEnter the amount to be withdrawn...!");
			Double withdAmount = sc1.nextDouble();
			counter.withdraw(withdAmount);
			break;

			case 3 : counter.checkBalance();
				
			break;

			case 0 : break;//exiting

			default : System.out.println("\tInvalid input...!");
			break;
			}
		}while(operation >=0 && operation <=3);
	}

}

