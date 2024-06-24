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
		if(this.size == this.maxSize) {
			throw new RuntimeException("큐가 가득 찼습니다.");
		} 
		// 큐의 끝에 rear가 도달한 경우
		if(rear == maxSize -1) {
			rear = -1;
		}
		
		values.add(++rear, value) ;
		size++;
	}

	@Override
	public int size() {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size == 0;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("큐가 비어있습니다.");
		}
		
		T value = values.get(front++);
		
		if (front == maxSize) {
			front = 0 ;
		}
		
		size--;
		
		
		return value;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("큐가 비어있습니다.");
		}
		
		return values.get(front) ;
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		int front = this.front;
		
		for (int i = 0 ; i < size ; i ++) {
			if (values.get(front).equals(value)) {
				result = true;
				
				break;
			}
			
			front = (front + 1) % maxSize;
		}
		
		return result;
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
