package com.bridgelabz.designpattern;

//lazy initialization,instead of creating object at the declaration, here we create in static method
public class LazyEagerInitialization 
{
	//private constructor
	private LazyEagerInitialization()
	{
		
	}
	private static LazyEagerInitialization lazy_instance;
	
	//return the reference of object
	public static LazyEagerInitialization getLazyinstance()
	{
		if(lazy_instance==null)
		{
		lazy_instance=new LazyEagerInitialization();
		}
		return lazy_instance;
	}
	
}
