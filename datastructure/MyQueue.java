package com.bridgelabz.datastructure;

public class MyQueue<T>
{	
	private T[] items;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	//empty Constructor
	public MyQueue()
	{
		items =(T[])new Object();
		int front=0;
		int rear=-1;
		int size=0;
		int capacity=500;

	}
	//Constructor
	public MyQueue(int capacity)
	{
		items =(T[])new Object[capacity];
		int front=-1;
		int rear=-1;
		int size=0;
		this.capacity=capacity;

	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public boolean isFull()
	{
		return size==capacity;
	}
	
	public void enqueue(T element)
	{
	if(isFull())
	{
		System.out.println("the queue is full");
	}
	rear = (rear +1) % capacity;
	items[rear] =  element;
	size++;
}
	
	
	public T dequeue() {
		if (isEmpty()) 
		{
			System.out.println("Queue is empty...Enqueue some items before dequeuing it...!");
			
		}
		T element= items[front]; 
		front = (front + 1) % capacity; 
		size = size - 1; 
		return element; 
	}
	
	//return the front element of the queue
	public T peek()
	{
		if(isEmpty())
		{
			System.out.println("the queue is empty");
		}
		return items[front];
	}
	public int size()
	{
		return size;
	}
}
