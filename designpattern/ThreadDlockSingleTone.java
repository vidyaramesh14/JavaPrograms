package com.bridgelabz.designpattern;

public class ThreadDlockSingleTone 
{
private static ThreadDlockSingleTone new_instance;

	private ThreadDlockSingleTone()
	{
		
	}
	public static ThreadDlockSingleTone getNewInstance()
	{
		if(new_instance==null)
		{
			synchronized(ThreadDlockSingleTone.class)
			{
				new_instance=new ThreadDlockSingleTone();
			}
		}return new_instance;
	}
}
