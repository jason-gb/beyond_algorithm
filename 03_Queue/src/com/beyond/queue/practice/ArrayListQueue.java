package com.beyond.queue.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {
	private List<T> values;
	private int size;
	private int maxSize;
	private int front;
	private int rear;
	
	public ArrayListQueue(int maxSize) {
		this.maxSize = maxSize;
		this.values = new ArrayList<T>();
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	@Override
	public void enqueue(T value) {
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public T dequeue() {
		
		return null;
	}

	@Override
	public T peek() {
		
		return null;
	}

	@Override
	public boolean contains(T value) {
		
		return false;
	}

	@Override
	public String toString() {
		
		int front = this.front;//현재 가리키고 있는 front
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(values.get(i) + ", ");

            front = (front + 1) % maxSize;
        }
        if(sb.lastIndexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        }else {
            sb.append("]");
        }
        return sb.toString();
	}
	

}
