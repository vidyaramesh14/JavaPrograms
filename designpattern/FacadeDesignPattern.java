package com.bridgelabz.designpattern;

//step 1 create an interface
interface Shape 
{
	 void draw();
}
//step 2 create concrete method to use interface
class Rectangle implements Shape//for rectangle
{
	public void draw()
	   {
	      System.out.println("Rectangle::draw()");
	   }
}
class Square implements Shape//for Square
{   
	public void draw() 
	{
	      System.out.println("Square::draw()");
	 }
}
class Circle implements Shape//for Circle
{   
	public void draw() {
	      System.out.println("Circle::draw()");
	   }
}
//step 3 create Facade class
 class ShapeMaker 
 {   private Shape circle;
	 private Shape rectangle;
	 private Shape square;

	 public ShapeMaker() 
	 {
		 circle = new Circle();
		 rectangle = new Rectangle();
		 square = new Square();
	 }

	 public void drawCircle()
	 {
		 circle.draw();
	 }
	 public void drawRectangle()
	 {
		 rectangle.draw();
	 }
	 public void drawSquare()
	 {
		 square.draw();
	 }
 }
 
 //step 4 Use the facade to draw various types of shapes.
public class FacadeDesignPattern 
{
	public static void main(String[] args)
	{ ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
	    shapeMaker.drawRectangle();
	    shapeMaker.drawSquare();	
	}
}
 