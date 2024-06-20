package com.beyond.stack;

import java.util.ArrayList;

import com.beyond.stack.practice.ArrayListStack;
import com.beyond.stack.practice.ArrayStack;
import com.beyond.stack.practice.LinkedListStack;
import com.beyond.stack.practice.Stack;

public class Application {

	public static void main(String[] args) {
		// 자바에서 제공하는 Stack 테스트
//		Stack<String> stack = new Stack<>();
		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println();
//	
//		stack.push("딸기");
//		stack.push("포도");
//
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println();
//		
//		// pop() 테스트
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println();
//		
//		// contains() 테스트
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println();
//		
//		// peek() 테스트
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println();
		
		// ArrayStack 구현 및 테스트
//		Stack<String> stack = new ArrayStack<String>(String.class, 5);
//		Stack<String> arrayStack = new ArrayStack<String>(5);
//		
//		System.out.println(arrayStack);
//		System.out.println(arrayStack.isEmpty());
//		System.out.println(arrayStack.size());
//		System.out.println();
//	
//		arrayStack.push("딸기");
//		arrayStack.push("포도");
//
//		System.out.println(arrayStack);
//		System.out.println(arrayStack.isEmpty());
//		System.out.println(arrayStack.size());
//		System.out.println();
//		
//		// pop() 테스트
//		System.out.println(arrayStack.pop());
//		System.out.println(arrayStack);
//		System.out.println(arrayStack.size());
//		System.out.println(arrayStack.isEmpty());
//		System.out.println();
//		
//		// contains() 테스트
//		System.out.println(arrayStack.contains("딸기"));
//		System.out.println(arrayStack.contains("포도"));
//		System.out.println();
//		
//		// peek() 테스트
//		System.out.println(arrayStack.peek());
//		System.out.println(arrayStack);
//		System.out.println();
		
//		Stack<String> stack = new ArrayListStack<>(5);
//		Stack<String> stack = new ArrayStack<>(5);
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		stack.push("딸기");
//		stack.push("포도");
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println();
		
		// LinkedListStack 구현 및 테스트
		Stack<String> stack = new LinkedListStack<String>();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println();
	
		stack.push("딸기");
		stack.push("포도");

		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println();
		
		// pop() 테스트
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		
		// contains() 테스트
		System.out.println(stack.contains("딸기"));
		System.out.println(stack.contains("포도"));
		System.out.println();
		
		// peek() 테스트
		stack.push("포도");
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();
		
//		Stack<String> stack = new ArrayListStack<>(5);
//		Stack<String> stack = new ArrayStack<>(5);
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		stack.push("딸기");
//		stack.push("포도");
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println();
	}

}
