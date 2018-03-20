package com.metacube;

import java.util.ArrayList;
import java.util.List;

class Node {
	Object data;
	Node left, right;
	
	public Node(Object item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;
	List<Object> preorder = new ArrayList<>();
	List<Object> postorder = new ArrayList<>();
	
	public BinaryTree() {
		root = null;
	}
	
	private void printPreorder(Node node) {
		if(node == null) {
			return;
		}
		
		preorder.add(node.data);
		
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	private void printPostorder(Node node) {
		if(node == null) {
			return;
		}
		
		printPostorder(node.left);
		printPostorder(node.right);
		
		postorder.add(node.data);
	}
	
	public Object[] preorderTraversal() {
		printPreorder(root);
		
		return preorder.toArray();
	}
	
	public Object[] postorderTraversal() {
		printPostorder(root);
		
		return postorder.toArray();
	}
}
