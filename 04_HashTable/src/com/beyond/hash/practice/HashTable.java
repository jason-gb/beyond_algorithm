package com.beyond.hash.practice;

import java.util.LinkedList;

public class HashTable <K, V>{
	private int maxSize;
	private int size;
	
	private LinkedList<HashNode<K, V>>[] buckets;
	
	@SuppressWarnings("unvhecked")
	public HashTable(int maxSize) {
		this.maxSize = maxSize;
		this.buckets = new LinkedList[this.maxSize];
		
		for(int i = 0 ; i < buckets.length ; i++) {
			this.buckets[i] = new LinkedList<>();
		}
	}
	
	public void put(K key, V value) {
		int index = this.hash(key);
		
		// key 안에 value가 존재하면 새로운 value로 변경해주는 코드
		for (HashNode<K, V> node : buckets[index]) {
			if(node.key.equals(key)) {
				node.value = value;
				return;
			}
		}
		
		buckets[index].add(new HashNode<>(key, value));
	}
	
	public V get(K key) {
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				return node.value;
			}
		}
		return null ;
	}
	
	public V remove(K key) {
		V value = null;
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				value = node.value;
				
				// 노드 제거
				buckets[index].remove(node);
				break;
			}
		}
		
		return value;
	}
	
	public int size() {
		int sum = 0;
		
		for(int i = 0 ; i < this.buckets.length ; i++) {
			sum += this.buckets[i].size();
		}
		
		return sum;
	}
	
	public boolean isEmpty() {
		
		
		return this.size == 0;
	}
	
	public boolean contains(K key) {
		boolean result = false;
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if(node.key.equals(key)) {
				result = true;
				
				break;
			}
		}
		
		return result;
	}
	
	private int hash(K key) {
		
		return Math.abs(key.hashCode() % this.maxSize);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < this.buckets.length ; i++) {
			LinkedList<HashNode<K, V>> bucket = this.buckets[i];
			
			sb.append(i).append(":").append(bucket).append(",").append("\n");
		}
		sb.replace(sb.lastIndexOf(","), sb.length(), "");
		
		
		return sb.toString();
	}
	
	private static class HashNode<K,V>{
		private K key;
		private V value;
		
		private HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		@Override
		public String toString() {
			
			return "{key=" + key + ", value=" + value + "}";
		}
	}
}