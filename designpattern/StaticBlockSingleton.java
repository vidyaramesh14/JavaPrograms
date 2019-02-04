package com.bridgelabz.designpattern;

public class StaticBlockSingleton
{
private static StaticBlockSingleton new_instance;
	//private constructor
	private StaticBlockSingleton()
	{
		
	}
	//static initializer to create instance of class
	static 
	{
		try
		{
			new_instance=new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//return the reference of object
	public static StaticBlockSingleton getNewInstance()
	{
		return new_instance;
	}
}
