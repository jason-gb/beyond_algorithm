package com.beyond.list.practice;

public class DoublyLinkedList<T> implements List<T> {

	@Override
	public void addFirst(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}
	
	private static class Node<T> {
		private T data; // 노드가 저장하는 데이터
		
		private Node<T> prev; // 이전 노드를 가리키는 참조
		
		private Node<T> next; // 다음 노드를 가리키는 참조

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

}