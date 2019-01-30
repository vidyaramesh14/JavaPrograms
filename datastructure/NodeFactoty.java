package com.bridgelabz.datastructure;

public class NodeFactoty<T>
{   
	public static <T> Node<T> getNode(T item)
	{  	
		Node<T> newNode = new Node<T>();
	    newNode.setData(item);
	    newNode.setNext(null);
	    return newNode;
	}
}
