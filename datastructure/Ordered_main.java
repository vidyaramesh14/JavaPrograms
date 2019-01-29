package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ordered_main 
{
	public static void main(String[] args) 
	{
		String path ="/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/datastructure/ordered.txt";
		String[] numbers;
		String line="";
		int key;

		
		Scanner sc1=new Scanner(System.in);
		try(BufferedReader br=new BufferedReader(new FileReader(path)))
		{
			String temp=null;
			while((temp=br.readLine())!=null)
			{
			line+=temp;
			}
			numbers=line.split(",");
			//create a linked list for the words
			OrderedList<Integer>list=new OrderedList<>();
			for(int i=0;i< numbers.length;i++) {
				list.add(Integer.parseInt(numbers[i]));
			}
			System.out.println(" Numbers list :");
			//display data of each node in the list
			list.printOrderedList();
			//read the key to be searched
			System.out.println(" Enter a number...! ");
			try 
			{
						key=sc1.nextInt();
						boolean isKeyPresent=list.search(key);
						if(isKeyPresent) {
						System.out.printf("key '%s' is present in the list\n",key);
						list.remove(key);
				}
				else {
					System.out.printf("key '%s' is not present in the list\n",key);
					list.add(key);
				}
				//display data of each node in the list
				list.printOrderedList();
			}
			catch(InputMismatchException e) {
				System.out.println("Key must be a number ...!");
			}
			//write back the list to file
			list.writeToFile(list,path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc1.close();
	}
}
