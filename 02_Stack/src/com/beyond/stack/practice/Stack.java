package com.beyond.stack.practice;

public interface Stack<T> {
	public abstract void push(T value);
	
	boolean isEmpty();
	
	int size();

	T pop();
	
	boolean contains(T value);

	T peek();
	
}
