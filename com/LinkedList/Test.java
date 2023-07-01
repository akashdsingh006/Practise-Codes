package com.LinkedList;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class Test {
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++)
		{
			add(new Node(i));
		}
		addFirst(new Node(-100));
		
		print(head);
		System.out.println();
		
		Reverse();
		print(head);
	}
	static void add(Node node)
	{
		if(head==null)
		{
			head=node;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			//curr=node;
			curr=curr.next;
		}
		curr.next=node;
	}
	static void print(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	static void addFirst(Node node)
	{
		if(head==null)
		{
			head=node;
			return;
		}
		
		node.next=head;
		head=node;
	}
	
	static void Reverse()
	{
		Node prev=null;
		Node curr=head;
		while(curr!=null)
		{
			Node nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		head=prev;
		
	}
}
