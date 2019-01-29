package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UnOrdered_main 
{
	public static void main(String[] args) 
	{
		String path ="/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/datastructure/unorderedList.txt";
		String[] words;
		String line="";
		String key="";
		
		try(BufferedReader br=new BufferedReader(new FileReader(path));
		Scanner sc=new Scanner(System.in))
		{
			String temp=null;
			while((temp=br.readLine())!= null)
			{
			line+=temp;
			}
			words=line.split(" ");
			//create a linked list for the words
		UnOrdered_List<String> list=new UnOrdered_List<>();
				for(int i=0;i< words.length;i++) 
				{
				list.add(words[i]);
				}
			System.out.println("***************** Words list : *****************************");
			//display data of each node in the list
			list.show();
	        //read the key to be searched
			do 
			{
			System.out.println("************** Enter element **********************");
			key=sc.next();
			}while(key.trim().equals("") ||key==null);

			boolean isKeyPresent;
			isKeyPresent=list.search(key);
			if(isKeyPresent)
			{
			System.out.printf("\n key '%s' is present in the list\n",key);
			list.remove(key);
			}	
			else 
			{
			System.out.printf("\nkey '%s' is not present in the list\n",key);
			list.add(key);
			}
			//display data of each node in the list
			list.show();
			list.writeToFile(list, path);
		} 
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		} 
		catch(IOException e) 
		{
		e.printStackTrace();
		}
	}
}
