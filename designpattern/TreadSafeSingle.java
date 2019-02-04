package com.bridgelabz.designpattern;

public class TreadSafeSingle 
{
	//private constructor 
	private TreadSafeSingle()
	{
		
	}
	private static TreadSafeSingle new_instance ;
	
	//static synchronized method to create instance of class
	public static synchronized TreadSafeSingle getNewInstance()
	{
		if(new_instance==null)
		{
			new_instance=new TreadSafeSingle();
		}
		return new_instance;
	}
	
}
