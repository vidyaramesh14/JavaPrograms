package com.bridgelabz.designpattern;

public class PC extends Computer{
	private String ram;
	private String motherboard;
	private String processor;
	
	public PC(String ram, String motherboard, String processor){
		this.ram=ram;
		this.motherboard=motherboard;
		this.processor=processor;
	}
	@Override
	public String RAM() {
		return this.ram;
	}

	@Override
	public String MOTHERBOARD() {
		return this.motherboard;
	}

	@Override
	public String PROCESSOR() {
		return this.processor;
	}

}
