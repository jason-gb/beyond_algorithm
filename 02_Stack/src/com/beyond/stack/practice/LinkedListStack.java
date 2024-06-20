package com.beyond.stack.practice;

public class LinkedListStack<T> implements Stack<T> {
	private Node<T> top;
	private int size;
	
	
	public LinkedListStack() {
		top = null;
		size = 0;
		
	}

	@Override
	public void push(T value) {
		Node<T> newNode = new Node<>(value);
		
		newNode.next = top;
		top = newNode;
		size++;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		} 
		
		T value = top.data;
		
		top = top.next;
		
		return value;
	}

	@Override
	public boolean contains(T value) {
		Node<T> current = top;
		
		while(current != null) {
			if (current.data.equals(value)) {
				return true;
			}
			current = current.next;
		}

		return false;
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
    		throw new RuntimeException("스택이 비어있습니다.");
    	} 
		T value = top.data;
		
		return value;
	}

	@Override
	public String toString() {
		Node<T> current = top;
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
	
	
	private static class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	

}
