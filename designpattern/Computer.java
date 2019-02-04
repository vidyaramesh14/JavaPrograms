package com.bridgelabz.designpattern;

public abstract class Computer {
	public abstract String RAM();
	public abstract String MOTHERBOARD();
	public abstract String PROCESSOR();
	
	@Override
	public String toString(){
		return "RAM= "+this.RAM()+", HDD="+this.MOTHERBOARD()+", CPU="+this.PROCESSOR();
	}
}
