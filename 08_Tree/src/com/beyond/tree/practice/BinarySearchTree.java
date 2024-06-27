package com.beyond.tree.practice;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public void insert(int value) {
		// 내부 재귀 호출용 노드
		this.root = this.insert(this.root, value);
	}
	
	
	private Node insert(Node node, int value) {
		if(node == null) {
			node = new Node(value);
		
			return node;
		}
		
		if(value > node.value) {
			node.right = insert(node.right, value);
		} else if (value < node.value) {
			node.left = insert(node.left, value);
		}
		
		return node;
	}
	
	public void order() {
		// 전위 순회
		this.preorder(this.root);
		// 중위 순회
//		this.inorder(this.root);
		// 후위 순회
//		this.postorder(this.root);
	}


	private void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.value + " ");
		}
	}

	private void preorder(Node node) {
		if (node != null) {
			System.out.println(node.value + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}

	private void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.value + " ");
			inorder(node.right);
		}
	}

	public boolean search(int value) {
		
		return this.search(root, value) != null;
	}

	

	private Node search(Node node, int value) {
		if (node == null || node.value == value) {
			return node;
		} else if (node.value > value) {
			return search(node.left, value);
		} else {
			return search(node.right, value);
		}

	}

	public void delete(int value) {
		this.root = this.delete(this.root, value);
	}

	private Node delete(Node node, int value) {
		if (node == null) {
			return node;
		} else if (node.value > value) {
			node.left = delete(node.left, value);
		} else if (node.value < value) {
			node.right = delete(node.right, value);
		} else {
			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}
			
			node.value = this.minValue(node.right);
			node.right = delete(node.right, node.value);
		}
		return node;
	}

	private int minValue(Node node) {
		int minValue = node.value;
		
		while (node.left != null) {
			minValue = node.left.value;
			
			node = node.left;
		}
		return minValue;
	}

	private static class Node {
		private int value;
		private Node left;
		private Node right;
		
		private Node(int value) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}



}
