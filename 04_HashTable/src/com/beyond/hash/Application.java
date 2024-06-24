package com.beyond.hash;

import com.beyond.hash.practice.HashTable;

public class Application {

	public static void main(String[] args) {
		HashTable<String, String> hashTable = new HashTable<>(5);
		
		// put 메소드 테스트
		hashTable.put("strawberry","딸기");
		hashTable.put("apple","사과");
		hashTable.put("grape","포도");
		hashTable.put("banana","바나나");
		hashTable.put("banana","몽키바나나");
		
		System.out.println(hashTable);
		System.out.println();
		
		// get 메소드 테스트
		System.out.println(hashTable.get("banana"));
		System.out.println(hashTable.get("melon"));		
		System.out.println();
		
		// remove 메소드 테스트
		System.out.println(hashTable.remove("banana"));
		System.out.println(hashTable.remove("strawberry"));
		System.out.println(hashTable.remove("melon"));
		System.out.println(hashTable);
		System.out.println();
		
		// contains 메소드 테스트
		System.out.println(hashTable.contains("grape"));
		System.out.println(hashTable.contains("banana"));
		System.out.println();
		
		// size 메소드 테스트
		System.out.println("size : " + hashTable.size());
		System.out.println(hashTable.isEmpty());
		System.out.println(hashTable);
		System.out.println();
		
		// isEmpty 메소드 테스트
		System.out.println(hashTable.isEmpty());
		System.out.println(hashTable);
		System.out.println();
	}

}
