package com.bridgelabz.designpattern;

public class BillPushSingleton {
	//private constructor
	private BillPushSingleton()
	{
		
	}
	//private inner class,it is not loaded into memory and only when someone calls the getInstance method,
	//this class gets loaded and creates the Singleton class instance.
	private static class HelperClass
	{
		private static final BillPushSingleton instance=new BillPushSingleton();
	}
	public static BillPushSingleton getNewInstance()
	{   
		return HelperClass.instance;
	}
}
