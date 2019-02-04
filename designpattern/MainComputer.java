package com.bridgelabz.designpattern;

public class MainComputer {

	public static void main(String[] args) 
	{
		Computer pc = ComputerFactory.getComputer("PC","2 GB","CaseCom","1.8 GHz");
		Computer server = ComputerFactory.getComputer("Server","16 GB","RAIDMax","2.8 GHz");
		System.out.println(" PC Configuration::"+pc+"\n"+" Server Configuration::"+server);
		
	}
}
