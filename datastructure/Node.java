package com.bridgelabz.datastructure;

public class Node<T> implements Comparable<T>
{
private T data;
private Node<T> next;
	/**
	 * assigns the item to the node
	 * @param item data of the node
	 */
	public void setData(T item)
	{
		this.data=item;
	}
	/**
	 * gives the data of the node
	 * @return data of the node
	 */
	public T getData()
	{
		return this.data;
	}
	/**
	 * updates the nodes next link
	 * @param node next node
	 */
	public void setNext(Node<T> node) 
	{
		this.next=node;
	}

	/**
	 * returns the next link of the node
	 * @return next node reference
	 */
	public Node<T> getNext()
	{
		return this.next;
	}
	public boolean equals(Object item) 
	{
		if(this.getData().equals((T)item))
			return true;
		else
			return false;
	}

	/**
	 * compares the two items
	 * @return 0 if equal, + value if greater than passed arg, else - value
	 */
	
	public int compareTo(T otherItem) {
		return ((Comparable<T>) this.getData()).compareTo(otherItem);
	}
}
