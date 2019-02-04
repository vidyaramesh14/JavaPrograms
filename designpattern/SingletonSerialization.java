package com.bridgelabz.designpattern;

import java.io.Serializable;

public class SingletonSerialization implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private SingletonSerialization()
	{
		
	}
	private static class Helper
	{
		private static final SingletonSerialization new_instance =new SingletonSerialization();
	}
	public static SingletonSerialization getNewInstance()
	{
		return Helper.new_instance;
	}
}
