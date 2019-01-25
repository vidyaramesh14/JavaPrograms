package com.bridgelabz.datastructure;

public class LinkedListStack<T>
{
	private Node<T> top_node;
	int size;

	public LinkedListStack()
	{
		top_node=null;
		size=0;
	}
	
	public void push(T element)
	{
		Node<T> new_node=new Node< >();
		new_node.setData(element);
		new_node.setNext(top_node);
		top_node = new_node;
		size++;
	}
	public T  pop()
	{
		T item=top_node.getData();
		top_node=top_node.getNext();
		size--;
		return item;
	}
	public T top_element()
	{
		return top_node.getData();
	}
	public int size()
	{
		return size;
	}
}
