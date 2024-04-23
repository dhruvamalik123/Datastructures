package com.datastructure;

public class linkedList {
	private  Node head;
	private  Node tail;
	private int size;
	public linkedList(){
		this.size=0;
	}
	public void insertFirst(int data){
		Node node=new Node(data);
		node.next=head;
		head=node;
		if(tail==null){
			tail=head;
		}
		size++;
	}
	public void insertLast(int data){
//		Node node=new Node(data);
//		Node temp=tail;
//		temp.next=node;
//		tail=node;
		if(head==null){
			insertFirst(data);
		}
		else{
			Node node=new Node(data);
			tail.next=node;
			tail=node;
			size++;
		}

	}
	public void insert(int position,int data){
		if(position==1){
			insertFirst(data);
		}
		else if(position==size){
			insertLast(data);
		}
		else{
			Node temp=head;
			int count=1;
			while(count!=position){
				temp=temp.next;
				count++;
			}
//			Node temp2=temp.next;
//			Node node=new Node(data);
//			temp.next=node;
//			node.next=temp2;
			Node node=new Node(data,temp.next);
			temp.next=node;
			size++;


//			System.out.println(temp.data);
		}
	}
	public void Size(){
		System.out.println(size);
	}
	public void Display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	public void search(int searchValue){
//		int flag=0;
		Node temp=head;
		while(temp!=null){
			if(temp.data==searchValue){
//				flag=1;
				break;
			}
			temp=temp.next;
		}
		if(temp!=null){
			System.out.println("found");
		}
		else{
			System.out.println("Not Found");
		}
	}
	public void deleteFirst(){
		if(head==null){
			System.out.println("Empty,cannot delete");
			return;
		}
		int val=head.data;
		head=head.next;
		if(head==null){
			tail=null;
		}
		System.out.println("deleted ::"+val);
		size--;
	}
	public void deleteLast(){
		if(size<=1){
			deleteFirst();
		}
		Node temp=head;
		while(temp.next!=tail){
			temp=temp.next;
		}
		temp.next=null;
		System.out.println("deleted ::"+tail.data);
		tail=temp;
		size--;

	}

//	public void delete(int position){
//		if(position==1){
//			deleteFirst();
//		}
//		else if(position==size){
//			deleteLast();
//		}
//		else{
//			Node temp=head;
//			for(int i=0;)
//		}
//	}

	private class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}

		public Node(int data , Node next) {
			this.data=data;
			this.next = next;
		}
	}
}

