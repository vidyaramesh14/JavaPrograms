package com.bridgelabz.datastructure;

public class Deque<T>
{
private T[] items;
private int front;
private int rear;
private int size;
private  int capacity=500;

public Deque()
{
	capacity=0;
	items=(T[])new Object[capacity];
	front=-1;
	rear=-1;
	size=0;
}

	public Deque(int capacity)
	{
		this.capacity=capacity;
		items=(T[])new Object[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public boolean isEmpty()
	{
		return(size==0);	
	}	
	public boolean isFull()
	{
		return(size==capacity);	
	}
	public void addFront(T element)
	{
		if(isFull())
		{
			System.out.println("the queue is full ");
		}
		else if(front==rear)
		{
			items[++front]=element;
			rear=front;
			size++;
		}
		else if(rear<capacity-1)
		{
			front=(front-1)%capacity;
			items[front]=element;
			size++;
		}
	}
	public T removeFront()
	{
		T element=null;
		if(isEmpty())
		{
			System.out.println("the queue is empty");
		}
		else if(rear==-1&&front==-1)
		{
			 element=items[front];
			front=rear=-1;
		}
		else
			{	element=items[front];
				front=(front+1)%capacity;
				size--;
				
			}return element;
	}
	public void addRear(T element)
	{	
		
		if(isFull())
		{
			System.out.println("the queue is full ");
		}
		else if(front==rear)
		{
			items[++rear]=element;
			front=rear;
			size++;
		}
		else if(front>0)
		{
			rear=(rear+1)%capacity;
			items[rear]=element;
			size++;
		}
	}
	public T removeRear()
	{
	if(isEmpty())
	{
		System.out.println("the queue is empty");
	}
	if(rear==-1&&front==-1)//single item queue
	{
		T element=items[front];
		rear=front=-1;
	}
		T element=items[rear];
		rear=(rear-1)%capacity;
		size--;
		return element;
	}
	

}
