package com.bridgelabz.designpattern;

public class ComputerFactory 
{
	public static Computer getComputer(String type,String ram,String motherboard,String processor)
	{
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram,motherboard,processor);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram,motherboard,processor);
		return null;
	}
}