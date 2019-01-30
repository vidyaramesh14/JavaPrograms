package com.bridgelabz.datastructure;

public class LinkedListQueue<T>
{	// empty constructor
	public Node<T> front;
	public Node<T> rear;
	private int size;
	Node<T> node=new Node<T>();
	public LinkedListQueue()
	{
		front=null;
		rear=null;
		size=0;

	}
	public int size()
	{
		return size;
	}
	//check whether the Node is empty
	public boolean isEmpty()
	{
		return size==0;
	}
	//
	public void enqueue(T item)
	{
		Node<T> node=new Node<T>();
		node.setData(item);
		node.setNext(null);
	
		if(isEmpty())
			front=rear=node;
		else 
		{
			rear.setNext(node);
			rear=node;
		}
		size++;
	}
	public T dequeue()
	{	if(isEmpty())
		{
		System.out.println("the stack is empty");
		}
		T item=front.getData();
		front=front.getNext();
		size--;
		return item;
	}
	public Node<T> getFront()
	{
		return front;
	}
	public Node<T> getRear()
	{
		return rear;
	}
 	
}
