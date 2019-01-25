	package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


	public class UnOrdered_List<T> {
		private Node<T> first;
		private Node<T> last;

		//default constructor
		public UnOrdered_List(){
			first  = null;
			last = null;
		}
		
		//check  empty
			public boolean isEmpty()
			{
				if(first == null)
					return true;
				else
					return false;
			}

		//adding element
		public void add(T item) {
			Node<T> new_node =new Node<T>(); 
			new_node.setData(item);
			new_node.setNext(null);
			if(isEmpty())
			{
				first =new_node;
				last = first;
				return;
			}
			if(search(item))
				System.out.printf("Item already exits in the list...!");
			else
	          append(item);
		}

		//remove item
		public void remove(T item) {
			Node<T>	temp = null;
			Node<T> curr = null;
			if(isEmpty())
				System.out.println("List is empty...!");
			else if(first.getData().equals(item) && first.getNext() == null)// one item list
			{
				first = null;
				last = null;
			}
			else if(first.getData().equals(item) && first.getNext() != null)
			{
				//update only first
				temp = first;
				first = first.getNext();
				temp = null;
			}
			else {
				temp = first;
				curr = first.getNext();
				while(curr != null) {
					if(curr.getData().equals(item))
					{
						temp.setNext(curr.getNext());
						curr.setNext(null);
						break;
					}
					else {
						temp = curr;
						curr = curr.getNext();
					}
				}
			}
		}
		//check the item is present in the list
		public boolean search(T item) {
			if(first == null)
				return false;
   			Node<T> temp = first;
			while(temp != null) {
				if(temp.getData().equals(item))
					return true;
				temp = temp.getNext();
			}
			return false;
		}
		
		//size of list
		public int size() {
			int count = 0;
			Node<T> temp = first;
			while(temp != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}

		//adding at the end
		public void append(T item) {
			Node<T> new_node =new Node<T>(); 
			new_node.setData(item);
			new_node.setNext(null);
			if(isEmpty())
			{
				first = new_node;
				last=first;
			}
			else if(search(item))
				System.out.printf("Item already exits in the list...!");
			else {
				//Node<T> newNode = new_node;
				last.setNext(new_node);
				last = new_node;
			}
		}

		//insertion at a given position
		public void insert(int pos,T item) {
			Node<T> new_node =new Node<T>(); 
			new_node.setData(item);
			new_node.setNext(null);
			Node<T>	prev = first;
			Node<T> curr = first;
		//Node<T> newNode = new_node;
			int  count = -1;
			while(curr != null) {
				count++;
				if(count == pos && count == 0)// insertion at 0th position, update first
				{
					new_node.setNext(curr);
					first = new_node;
					break;
				}
				else if(count == pos) {
					new_node.setNext(curr);
					prev.setNext(new_node);
					break;
				}
				prev = curr;
				curr = curr.getNext();
			}
			if(curr == null && pos == count +1)//insertion after the last, update last
			{
				prev.setNext(new_node);
				last = new_node;
			}
			else {
				System.out.println("Given position is not found in the lsit...!");
			}
		}

		//remove and return the last item in the list
		public T pop() {
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return null;
			}
			if(first == last) {//remove the only item in the list
				first = last = null;
				return first.getData();
			}
			Node<T> curr = first;
			Node<T> prev = first;
			while(curr.getNext() != null) {//traverse to reach the last item in the list
				prev = curr;
				curr = curr.getNext();
			}
			//remove the curr item which is the last item in the list
			last = prev;
			last.setNext(null);
			return curr.getData();
		}

		//remove and return item at the given position
		public T pop(int pos) {
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return null;
			}
			Node<T> curr = first;
			Node<T> prev = first;

			int  count = -1;
			while(curr != null) {//traverse to reach the last item in the list
				count++;
				if(count == pos && count == 0)// removal at 0th position, update first
				{
					first = curr.getNext();
					curr.setNext(null);
					return curr.getData();
				}
				else if(count == pos && curr == last) {// remoavl at the last position
					last = prev;
					last.setNext(null);
					return curr.getData();
				}
				else if(count == pos){//removal in-between
					prev.setNext(curr.getNext());
					curr.setNext(null);
					return curr.getData();
				}
				prev = curr;
				curr = curr.getNext();
			}
			System.out.println("Given position is not found in the lsit...!");
			return null;
		}
		
		public int index(T item) {
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return -1;//error case
			}
			Node<T> curr = first;
			int  count = -1;
			while(curr != null) {
				count++;
				if(curr.getData() == item)
	                return  count;
			}
			System.out.println(item + "not found in the list...!");
			return -1;
		}
		//display the nodes of the list
		public void show() {
			Node<T> curr = first;
			while(curr != null) {
				System.out.print("   " +curr.getData());
				curr = curr.getNext();
			}
			System.out.println();
		}
		//
		public void writeToFile(UnOrdered_List<T> list, String filePath) {
			if(list == null)
				return;

			Node<T> curr = first;
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,false))){
				while(curr != null) {
					bw.write(curr.getData().toString()+" ");
					curr = curr.getNext();
				}
			} catch (IOException e) {
				System.out.println("Enter currect input");
			}
		}
		
	}

