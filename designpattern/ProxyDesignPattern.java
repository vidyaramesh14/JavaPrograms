package com.bridgelabz.designpattern;
//step 1 create an interface
interface Image {
	void display();
}

//step 2 Create concrete classes implementing the same interface
class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}
}
//step 3 create proxy class
class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
//step 4 Use the Proxy class to get object of Real class when required
public class ProxyDesignPattern {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("proxydesignpattern.jpg");

		//image will be loaded from disk
		image.display(); 
		System.out.println("");

		//image will not be loaded from disk
		image.display(); 	
	}

}