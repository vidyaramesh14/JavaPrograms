package com.bridgelabz.designpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EagerInitializedSingleton instance1=EagerInitializedSingleton.getnewinstance();
		EagerInitializedSingleton instance2=null;
		try
		{
		@SuppressWarnings("rawtypes")
		Constructor[] temp_con=EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor<EagerInitializedSingleton> con:temp_con)
			{
				con.setAccessible(true);
				instance2=con.newInstance();
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("instance1 ="+instance1.hashCode()+"\n"+"instance2 ="+instance2.hashCode());
	}

}
