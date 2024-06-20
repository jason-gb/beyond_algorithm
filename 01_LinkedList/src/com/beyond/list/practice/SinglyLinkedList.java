package com.beyond.list.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.zip.CRC32;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class SinglyLinkedList<T> implements List<T> {
	private Node<T> head; // 첫번째 노드를 가리키는 참조
	private int size;
	
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	
		size++;
		
	}

	@Override
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (head == null) {
			head = newNode;
		} else {
			Node<T> lastNode = head;
			
			for (int i = 0 ; i < size - 1 ; i ++) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		size++;
	}

	@Override
	public void add(int index, T data) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			this.addFirst(data);
			
			return;
		}
		if(index == size) {
			this.addLast(data);
			
			return;
		}
		Node<T> newNode = new Node<>(data);
		Node<T> prevNode = this.search(index - 1);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
		size++;
	}

	@Override
	public int size() {
		
		return size;
	}
	
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		} 
		
		return this.search(index).data;
	}
	
	@Override
	public boolean contains(T data) {
		Node<T> current = head;
		
		while(current != null) {
			if(current.data.equals(data)) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	@Override
	public void removeFirst() {
		if (head == null) {
			return;
		} else {
			Node<T> first = head;
			
			head = first.next;
			first.data = null;
			first.next = null;
			
			size--;
		}
		
	}

	@Override
	public void removeLast() {
		if(head == null) {
			return;
		} else if ((size - 2) <= 0) {
			this.removeFirst();
			return;
		} else {
			Node<T> lastPreNode = this.search(size - 2);
			
			lastPreNode.next.data = null;
			lastPreNode.next = null;
			
			size--;
		}
		
	}
	
	@Override
	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0) {
			this.removeFirst();
			
			return;
		}
		
		if(index ==(size - 1)) {
			this.removeLast();
			
			return;
		}
		
		Node<T> prevNode = this.search(index - 1);
		Node<T> targetNode = prevNode.next;
		
		prevNode.next = targetNode.next;
		targetNode.data = null;
		targetNode.next = null;
	}
	
	@Override
	public void remove(T data) {
		Node<T> current = head;
		
		if (current == null) {
			return;
		}
		
		if (current.data.equals(data)) {
			this.removeFirst();
			
			return;
		}
		
		for(int i = 0 ; i < size -1 ; i ++) {
			if(current.next.data.equals(data)) {
				Node<T> nextNode = current.next;
				
				current.next = nextNode.next;
				nextNode.data = null;
				nextNode.next = null;
				
				size--;
				
				break;
			}
			
			current = current.next;
		}
		
	}
	
	@Override
	public String toString() {
		Node<T> current = head;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
//		if (head != null) {
//			sb.append(head.data);
//		}
		
		while(current != null) {
			sb.append(current.data + ", ");
			current = current.next;
		}
		if (sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");			
		} else {
			sb.append("]");
		}

		return sb.toString();
	}
	
	private Node<T> search(int index){
		Node<T> node = head;
		
		for (int i = 0 ; i < index ; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	
	private static class Node<T>{
		private T data; // 노드가 저장하는 데이터
		private Node<T> next; // 다음 노드를 가리키는 참조 변수
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}





}
