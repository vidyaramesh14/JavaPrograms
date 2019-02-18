package com.bridgelabz.designpattern;
/*Class Adapter uses java inheritance and extends the source interface, in our case Socket class*/
public class SocketClass extends Socket implements SocketAdapter {
	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	public Volt get3Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
