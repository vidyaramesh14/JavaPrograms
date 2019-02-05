package com.bridgelabz.designpattern;

public class Adapterpattern {
	

		public static void main(String[] args) {
			
			testClassAdapter();
			testObjectAdapter();
		}

		private static void testObjectAdapter() {
			SocketAdapter sockobj = new SocketObject();
			Volt v3 = getVolt(sockobj,3);
			Volt v12 = getVolt(sockobj,12);
			Volt v120 = getVolt(sockobj,120);
			System.out.println("v3 volts using Object Adapter="+v3.getVolts());
			System.out.println("v12 volts using Object Adapter="+v12.getVolts());
			System.out.println("v120 volts using Object Adapter="+v120.getVolts());
		}

		private static void testClassAdapter() {
			SocketAdapter sockcls=new SocketClass();
			Volt v3=getVolt(sockcls,3);
			Volt v12=getVolt(sockcls,12);
			Volt v120=getVolt(sockcls,120);
			System.out.println("v3 volts using Class Adapter="+v3.getVolts());
			System.out.println("v12 volts using Class Adapter="+v12.getVolts());
			System.out.println("v120 volts using Class Adapter="+v120.getVolts());
		}
		
		private static Volt getVolt(SocketAdapter sockAdapter,int i) {
			switch (i){
			case 3:return sockAdapter.get3Volt();
			case 12:return sockAdapter.get12Volt();
			case 120:return sockAdapter.get120Volt();
			default:return sockAdapter.get120Volt();
			}
		}
	
}
