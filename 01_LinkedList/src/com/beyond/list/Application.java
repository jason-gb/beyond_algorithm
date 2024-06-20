package com.beyond.list;

import com.beyond.list.practice.List;
import com.beyond.list.practice.SinglyLinkedList;

public class Application {

	public static void main(String[] args) {
//		// 자바에서 제공하는 LinkedList테스트
//		List<String> list = new LinkedList<String>();
//		
//		// addFirst() 메소드 테스트 (Java 21부터 지원)
//		list.addFirst("사과");
//		list.addFirst("딸기");
//		
//		System.out.println(list);
//		System.out.println();
//		
//		// addLast() 메소드 테스트 (Java 21부터 지원)
//		list.addLast("포도");
//		list.addLast("키위");
//		
//		System.out.println(list);
//		System.out.println();
//		
//		// add() 메소드 테스트
//		list.add(1, "수박");
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println();
//		
//		// get() 메소드 테스트
//		System.out.println(list.get(0));
//		System.out.println(list.contains("딸기"));
//		System.out.println(list.contains("바나나"));
//		System.out.println();
//		
//		list.removeFirst();
//		System.out.println(list);
//		System.out.println();
//		
//		list.removeLast();
//		System.out.println(list);
//		System.out.println();
//		
//		// remove() 메소드 테스트
//		list.remove(0);
//		System.out.println(list);
//		System.out.println();
//		
//		list.remove("포도");
//		System.out.println(list);
//		System.out.println();
		
		// SinglyLinkedList 테스트
		List<String> list = new SinglyLinkedList<>();
		
		list.addFirst("사과");
		list.addFirst("딸기");
		list.addFirst("바나나");
		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println();
		
		// addLast() 메소드 테스트 (Java 21부터 지원)
		list.addLast("포도");
		list.addLast("키위");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		list.add(0, "수박");
		list.add(5, "바나나");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
//		list.add(2, "복숭아");
		list.add(5, "복숭아");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		System.out.println(list.get(6));
		System.out.println();
		
		System.out.println(list.contains("딸기"));
		System.out.println(list.contains("두리안"));
		System.out.println(list.contains("바나나"));
		System.out.println(list.contains("복숭아"));
		System.out.println();
		
		// removeFirst() 테스트
		list.removeFirst();

		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		// removeLast() 테스트
		list.removeLast();
	

		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		list.remove(3);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		list.remove("딸기");
//		list.remove("포도");
		list.remove("복숭아");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
	}

}
