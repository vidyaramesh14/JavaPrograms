package com.bridgelabz.utility;

public class Test{  
	int a;
	static int s;

	static{
		s=10;
		System.out.println("s="+s);
	}
	//
	{
		a=20;
		System.out.println("inside instance initial : a="+a);
	}

	public Test(){
		System.out.println("a="+a);
	}


	public static void main(String[] args) {  
		Test d = new Test();
	}  
}  
