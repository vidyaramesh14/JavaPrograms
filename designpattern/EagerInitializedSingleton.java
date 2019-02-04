package com.bridgelabz.designpattern;
//early initialization,here object is created at class loading time
public class EagerInitializedSingleton
{
	private static final EagerInitializedSingleton new_instance = new EagerInitializedSingleton();
	
	//private constructor to avoid creation of object from user
	private EagerInitializedSingleton()
	{
		
	}
	//return the reference of object
	public static EagerInitializedSingleton getnewinstance()
	{
		return new_instance;
	}
}
